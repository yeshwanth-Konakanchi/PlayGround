package com.crmindz.bcjmay2017.oops.classes.medium.lab8;

/**
 * @author Yeshwanth Konakanchi
 *Class to demonstrate the working of address entity class
 */
public class DemoAddress {

	public static void main(String[] args) {

		Address address = new Address();
		
		address.setAddressLine("8231 Ranchview Dr");
		address.setCity("Irving");
		address.setZip("75063");
		address.setState("Texas");
		
		String addLine = address.getAddressLine();
		String city = address.getCity();
		String zip = address.getZip();
		String state = address.getState();
		
		System.out.println("Address Line: " + addLine);
		System.out.println("City: " + city);
		System.out.println("Zip Code: " + zip);
		System.out.println("State: " + state);
	}
}
