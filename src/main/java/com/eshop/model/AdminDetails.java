package com.eshop.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;


	@Entity
	@Table
	@Component
	public class AdminDetails implements Serializable {
		
		@Id
		@GeneratedValue
		@Column(name = "product")
		private String product;
		
		@Column(name = "category")
		private String category;
		
		@Column(name = " suppliers")
		private String suppliers;
		

		public String getProduct() {
			return product;
		}

		public void setProduct(String product) {
			this.product = product;
		}

		public String getCategory() {
			return category;
		}

		public void setCategory(String category) {
			this.category = category;
		}

		public String getSuppliers() {
			return suppliers;
		}

		public void setSuppliers(String suppliers) {
			this.suppliers = suppliers;
		}
	}
		