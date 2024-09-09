package com.nareshit.model;

public class Product_details{
   Integer id;
   String name;
   Double Price;
   Integer quantity;
public Product_details() {
	super();
}
public Product_details(Integer id, String name, Double price, Integer quantity) {
	super();
	this.id = id;
	this.name = name;
	Price = price;
	this.quantity = quantity;
}
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Double getPrice() {
	return Price;
}
public void setPrice(Double price) {
	Price = price;
}
public Integer getQuantity() {
	return quantity;
}
public void setQuantity(Integer quantity) {
	this.quantity = quantity;
}
@Override
public String toString() {
	return "Product_details [id=" + id + ", name=" + name + ", Price=" + Price + ", quantity=" + quantity + "]";
}
   
   
}
