package com.shoppingcart.main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.shoppingcart.beans.Product;

public class App{

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/shoppingcart/main/Beans.xml");
		Product p = (Product)context.getBean("product");
		List<Product> list = p.getAllProducts();
		for(Product p1 : list) {
			System.out.println(p1.getId()+"--"+p1.getName()+"--"+p1.getPrice()+"--"+p1.getDesc());
		}
		Product p1 = p.getSingleProduct(2);
		System.out.println(p1);
		((ClassPathXmlApplicationContext)context).close();
	}

}
