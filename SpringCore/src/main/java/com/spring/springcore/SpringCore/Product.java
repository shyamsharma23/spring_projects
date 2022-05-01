package com.spring.springcore.SpringCore;

public class Product {
	
	private int productid;
	private String productname;
	private double price;
	
	public Product() {
	}
	
	public Product(int id, String name, double salary) {
		this.productid = id;
		this.productname = name;
		this.price = salary;
		
	}
	public int getProductid() {
		return productid;
	}
	public void setProductid(int productid) {
		this.productid = productid;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	

}
