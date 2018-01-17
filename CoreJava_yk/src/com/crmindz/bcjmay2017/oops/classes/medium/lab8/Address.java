package com.crmindz.bcjmay2017.oops.classes.medium.lab8;

/**
 * @author Yeshwanth Konakanchi
 *Class Address to populate address
 */
public class Address {

	public String getAddressLine() {
		return addressLine;
	}
	public void setAddressLine(String addressLine) {
		this.addressLine = addressLine;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	private String addressLine;
	private String city;
	private String zip;
	private String state;
	
	
}

