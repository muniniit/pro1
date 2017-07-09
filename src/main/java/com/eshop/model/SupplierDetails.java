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
	public class SupplierDetails implements Serializable {
		
		@Id
		
		@Column(name = "SupplierId")
		private int supplierId;
		@Column(name = "SupplierName")
		private String supplierName;
		
		@Column(name = "SupplierDescription")
		private String supplierDescription;

		public int getSupplierId() {
			return supplierId;
		}

		public void setSupplierId(int supplierId) {
			this.supplierId = supplierId;
		}

		public String getSupplierName() {
			return supplierName;
		}

		public void setSupplierName(String supplierName) {
			this.supplierName = supplierName;
		}

		public String getSupplierDescription() {
			return supplierDescription;
		}

		public void setSupplierDescription(String supplierDescription) {
			this.supplierDescription = supplierDescription;
		}

		
		
		}
