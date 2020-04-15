package com.niit.inventory.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Product {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private long id;


private String name;
private String brand;
private String madein;
private int quantity;
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}
private float price;
public Product() {
	super();
	// TODO Auto-generated constructor stub
}
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getBrand() {
	return brand;
}
public void setBrand(String brand) {
	this.brand = brand;
}
public String getMadein() {
	return madein;
}
public void setMadein(String madein) {
	this.madein = madein;
}
public float getPrice() {
	return price;
}
public void setPrice(float price) {
	this.price = price;
}


}
