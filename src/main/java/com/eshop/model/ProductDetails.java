package com.eshop.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;



	@Entity
	@Table
	@Component
	public class ProductDetails  {
		
		@Id
	     @Column(name = "ProductId")
		private int productId;
		
		@Column(name = "ProductName")
		private String productName;
		
		@Column(name = "ProductDescription")
		private String productDescription;
		
		@Column(name ="ProductPrice")
		private int productPrice;
		
		@Column(name ="SupplierId")
		private int supId;
		
		@Column(name ="CategoryId")
		private int catId;
		
		@Transient
		private MultipartFile pimage;
		
		@Column(name="stock")
		private int stock;
		
		
		
		

		public int getStock() {
			return stock;
		}

		public void setStock(int stock) {
			this.stock = stock;
		}

		public MultipartFile getPimage() {
			return pimage;
		}

		public void setPimage(MultipartFile pimage) {
			this.pimage = pimage;
		}

		public int getProductId() {
			return productId;
		}

		public void setProductId(int productId) {
			this.productId = productId;
		}

		public String getProductName() {
			return productName;
		}

		public void setProductName(String productName) {
			this.productName = productName;
		}

		public String getProductDescription() {
			return productDescription;
		}

		public void setProductDescription(String productDescription) {
			this.productDescription = productDescription;
		}

		public int getProductPrice() {
			return productPrice;
		}

		public void setProductPrice(int productPrice) {
			this.productPrice = productPrice;
		}

		public int getSupId() {
			return supId;
		}

		public void setSupId(int supId) {
			this.supId = supId;
		}

		public int getCatId() {
			return catId;
		}

		public void setCatId(int catId) {
			this.catId = catId;
		}

		

		
}

