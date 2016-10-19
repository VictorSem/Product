package org.example.pojo;

public class Product {
	
	private String name = "";
	private String price = "";
	private String brand = "";
	
	
	public String getName() {
		return name;
	}
	public Product setName(String name) {
		this.name = name;
		return this;
	}
	public String getPrice() {
		return price;
	}
	public Product setPrice(String price) {
		this.price = price;
		return this;
	}
	public String getBrand() {
		return brand;
	}
	public Product setBrand(String brand) {
		this.brand = brand;
		return this;
	}
	
	
	@Override
	public String toString() { 
		return "AllProduct [name=" + name + ", price=" + price + ", brand=" + brand + "]";
	}
}
