package com.example.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Shops")
public class Shop {
	@Id
	int _id;
	String picture;
	String name;
	String email;
	String city;
	Point location;        //Point defined in our application, not the one that exists in Java
			
	//Constructor
	public Shop(int _id, String picture, String name, String email, String city, Point location) {
		super();
		this._id = _id;
		this.picture = picture;
		this.name = name;
		this.email = email;
		this.city = city;
		this.location = location;
	}
	
	//getters and setters
	public int get_id() {
		return _id;
	}
	public void set_id(int _id) {
		this._id = _id;
	}
	public String getPicture() {
		return picture;
	}
	public void setPicture(String picture) {
		this.picture = picture;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Point getLocation() {
		return location;
	}
	public void setLocation(Point location) {
		this.location = location;
	}
	
}
