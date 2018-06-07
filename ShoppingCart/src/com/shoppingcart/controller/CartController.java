package com.shoppingcart.controller;

import java.util.List;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.shoppingcart.beans.Product;
import com.shoppingcart.beans.Vendor;

@Controller
public class CartController {
	@Autowired
	private Product product;
	@Autowired
	private Vendor vendor;
	
	@RequestMapping("/")
	public String showHome(Model model) {
		model.addAttribute("name", "Jack Green");
		model.addAttribute("dept", "Devlopment");
		return "index";
	}
	@RequestMapping("/Show-Products")
	public String showProducts(HttpSession session) {
		List<Product> list = product.getAllProducts();
		session.setAttribute("list", list);
		return "show_products";
	}
	@RequestMapping(value="/Show-Description")
	public String showProductDescription(Model model, @RequestParam("id") String id) {
		model.addAttribute("id",id);
		return "show_description";
	}
	@RequestMapping(value="/Vendor-Registration")
	public String vendorRegistration(Model model) {
		model.addAttribute("vendor", new Vendor());
		return "vendor_registration";
	}
	@RequestMapping(value="/Register", method=RequestMethod.POST)
	public String Register(@Valid Vendor v, BindingResult result) {
		if(result.hasErrors()) {
			return "vendor_registration";	
		}
		v.setAuthority("vendor");
		v.setEnabled("true");
		vendor.createVendor(v);
		return "registration_success";
	}
	@RequestMapping(value="/Add-Product")
	public String addProduct() {
		return "add_product";
	}
}
