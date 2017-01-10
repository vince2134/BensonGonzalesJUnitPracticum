package com.ideyatech.ut.exercise;

public class Product {
	private String productID;
	private String name;
	private double price;
	private int quantity=0;
	private int free=0;
	
	public int getFree() {
		return free;
	}

	public void setFree(int free) {
		this.free = free;
	}

	public Product(String productID, String name, double price) {
		super();
		this.productID = productID;
		this.name = name;
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void incrementQuantity() {
		this.quantity++;
	}

	public String getProductID() {
		return productID;
	}
	public void setProductID(String productID) {
		this.productID = productID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
}
