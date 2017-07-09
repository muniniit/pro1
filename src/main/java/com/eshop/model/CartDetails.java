package com.eshop.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table
@Component
public class CartDetails {

	@Id
	@GeneratedValue 
	@Column(name ="cartId")
	private int cartId;
	
	@Column(name ="cartUser")
	private String cartUser;
	
	@Column(name ="proId")
	private int proId;
	
	@Column(name ="proName")
	private String proName;
	
	@Column(name ="proPrice")
	private int proPrice;
	
	@Column(name ="totalPrice")
	private int totalPrice;

	
	public int getCartId() {
		return cartId;
	}

	public void setCartId(int cartId) {
		this.cartId = cartId;
	}

	public String getCartUser() {
		return cartUser;
	}

	public void setCartUser(String cartUser) {
		this.cartUser = cartUser;
	}

	public int getProId() {
		return proId;
	}

	public void setProId(int proId) {
		this.proId = proId;
	}

	public String getProName() {
		return proName;
	}

	public void setProName(String proName) {
		this.proName = proName;
	}

	public int getProPrice() {
		return proPrice;
	}

	public void setProPrice(int proPrice) {
		this.proPrice = proPrice;
	}

	public int getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}

	
}
