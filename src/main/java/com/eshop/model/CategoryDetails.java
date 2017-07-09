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
	public class CategoryDetails implements Serializable {
		
		@Id
		
		@Column(name = "CategoryId")
		private int categoryId;
		
		@Column(name = "CategoryName")
		private String categoryName;
		
		@Column(name = "CategoryDescription")
		private String categoryDescription;

		public int getCategoryId() {
			return categoryId;
		}

		public void setCategoryId(int categoryId) {
			this.categoryId = categoryId;
		}

		public String getCategoryName() {
			return categoryName;
		}

		public void setCategoryName(String categoryName) {
			this.categoryName = categoryName;
		}

		public String getCategoryDescription() {
			return categoryDescription;
		}

		public void setCategoryDescription(String categoryDescription) {
			this.categoryDescription = categoryDescription;
		}

		
		

		
}
