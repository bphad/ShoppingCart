package com.shoppingcart.beans;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.shoppingcart.model.Account;

@Component
public class Product {

	private int id;
	private String name;
	private String price;
	private String desc;

	private Account account;
	private Vendor vendor;

	public Vendor getVendor() {
		return vendor;
	}

	public Account getAccount() {
		return account;
	}

	@Autowired
	public void setAccount(Account account) {
		this.account = account;
	}

	@Autowired
	public void setVendor(Vendor vendor) {
		this.vendor = vendor;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public List<Product> getAllProducts() {
		return account.getAllProducts();

	}

	public Product getSingleProduct(int id) {
		Product p = account.getSingleProduct(id);
		return p;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + ", desc=" + desc + "]";
	}

}
