package com.java.sasha.inventory.communication.model;

public class Address {

	private String houseNumber;
	
	private String street;
	
	private String city;
	
	private String state;
	
	private String country;
	
	public String toString(){
		return "House Number:"+houseNumber+" Street:"+street+" City:"+city+
				" State:"+state+" Country:"+country;
				
	}
	
	public String getHouseNumber() {
		return houseNumber;
	}
	public void setHouseNumber(String houseNumber) {
		this.houseNumber = houseNumber;
	}
	public String getStreet() {
		return street;
	}
	public void setStreeet(String street) {
		this.street = street;
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
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
}
