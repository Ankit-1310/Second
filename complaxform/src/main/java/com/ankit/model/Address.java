package com.ankit.model;

public class Address {
 private String street;
 private String block;
 private String near;
 private String city;
 private String state;
 
 
public String getStreet() {
	return street;
}
public void setStreet(String street) {
	this.street = street;
}
public String getBlock() {
	return block;
}
public void setBlock(String block) {
	this.block = block;
}
public String getNear() {
	return near;
}
public void setNear(String near) {
	this.near = near;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
@Override
public String toString() {
	return "Address [street=" + street + ", block=" + block + ", near=" + near + ", city=" + city + ", state=" + state
			+ "]";
}
}
