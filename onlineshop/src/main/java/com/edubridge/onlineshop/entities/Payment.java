package com.edubridge.onlineshop.entities;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "payment")
public class Payment {
	

	@Id
@GeneratedValue(strategy =  GenerationType.IDENTITY)
	@Column(name = "product_id")
	 private  Integer productId;
	
	@Column(name = "product_name")
	 private  String productName;
	
	
	@Column(name = "product_price")
	private int productprice;
	
	private int totalprice;
	
	private  String paymentmethod;
	
	private String paymentstatus;
	
	 
	 public Payment() {
		 
		 
	 }

	 
	 

	public Payment(Integer productId, String productName, int productprice, int totalprice, String paymentmethod,
			String paymentstatus) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productprice = productprice;
		this.totalprice = totalprice;
		this.paymentmethod = paymentmethod;
		this.paymentstatus = paymentstatus;
	}




	public Integer getProductId() {
		return productId;
	}


	public void setProductId(Integer productId) {
		this.productId = productId;
	}


	public String getProductName() {
		return productName;
	}


	public void setProductName(String productName) {
		this.productName = productName;
	}


	public int getProductprice() {
		return productprice;
	}


	public void setProductprice(int productprice) {
		this.productprice = productprice;
	}


	public int getTotalprice() {
		return totalprice;
	}


	public void setTotalprice(int totalprice) {
		this.totalprice = totalprice;
	}


	public String getPaymentmethod() {
		return paymentmethod;
	}


	public void setPaymentmethod(String paymentmethod) {
		this.paymentmethod = paymentmethod;
	}


	public String getPaymentstatus() {
		return paymentstatus;
	}


	public void setPaymentstatus(String paymentstatus) {
		this.paymentstatus = paymentstatus;
	}


	@Override
	public int hashCode() {
		return Objects.hash(paymentmethod, paymentstatus, productId, productName, productprice, totalprice);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Payment other = (Payment) obj;
		return Objects.equals(paymentmethod, other.paymentmethod) && Objects.equals(paymentstatus, other.paymentstatus)
				&& Objects.equals(productId, other.productId) && Objects.equals(productName, other.productName)
				&& productprice == other.productprice && totalprice == other.totalprice;
	}


	@Override
	public String toString() {
		return "Paymententities [productId=" + productId + ", productName=" + productName + ", productprice="
				+ productprice + ", totalprice=" + totalprice + ", paymentmethod=" + paymentmethod + ", paymentstatus="
				+ paymentstatus + "]";
	}

}

	