package com.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="protab")
public class Product {
	
	@Id
	@GeneratedValue
	@Column(name="pid")
	private Integer prodId;
	
	@Column(name="pname")
	private String prodName;
	
	
	@Column(name="pcost")
	private double prodSal;


	public Product() {
		super();
	}
	
	

	public Product(String prodName, double prodSal) {
		super();
		this.prodName = prodName;
		this.prodSal = prodSal;
	}



	public Integer getProdId() {
		return prodId;
	}


	public void setProdId(Integer prodId) {
		this.prodId = prodId;
	}


	public String getProdName() {
		return prodName;
	}


	public void setProdName(String prodName) {
		this.prodName = prodName;
	}


	public double getProdSal() {
		return prodSal;
	}


	public void setProdSal(double prodSal) {
		this.prodSal = prodSal;
	}


	@Override
	public String toString() {
		return "Product [prodId=" + prodId + ", prodName=" + prodName + ", prodSal=" + prodSal + "]";
	}
	
	
	

}
