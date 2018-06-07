package com.shoppingcart.beans;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.springframework.beans.factory.annotation.Autowired;

import com.shoppingcart.model.Account;

public class Vendor {

	@Autowired
	private Account account;

	@Pattern(regexp = "\\w+", message = "Please Enter name")
	private String name;

	@Size(min = 4, max = 10, message = "City Shd b min=4 max=10 char")
	private String city;

	@Pattern(regexp = "\\w+\\@\\w+\\.\\w+", message = "Please Enter Valid Email")
	private String email;

	@Size(min = 4, max = 10, message = "Password Shd b min=4 max=10 char")
	private String password;

	private String authority;
	private String enabled;

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAuthority() {
		return authority;
	}

	public void setAuthority(String authority) {
		this.authority = authority;
	}

	public String getEnabled() {
		return enabled;
	}

	public void setEnabled(String enabled) {
		this.enabled = enabled;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Vendor [name=" + name + ", city=" + city + ", email=" + email + "]";
	}

	public void createVendor(Vendor v) {
		account.createVendor(v);
	}

}
