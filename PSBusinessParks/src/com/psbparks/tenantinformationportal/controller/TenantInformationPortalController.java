package com.psbparks.tenantinformationportal.controller;

import java.util.ArrayList;
import java.util.Scanner;

import com.psbparks.tenantinformationportal.entity.Address;
import com.psbparks.tenantinformationportal.entity.Company;
import com.psbparks.tenantinformationportal.entity.Contact;
import com.psbparks.tenantinformationportal.service.TenantInformationPortalService;


/**
 * @author Yeshwanth Konakanchi
 *	This is a controller class which contains methods to get the mock data and to display the tenant information
 */
public class TenantInformationPortalController {

	TenantInformationPortalService tenantInformation = new TenantInformationPortalService();

	
	
	/**
	 * @param args
	 * main method that takes the tenant data and displays the tenant information
	 */
	public static void main(String[] args) {

		TenantInformationPortalController tenantInfo = new TenantInformationPortalController();
		tenantInfo.getTenantMockData();
		tenantInfo.displayTenantData();

	}
	
	
	/**
	 * This method takes the tenant info as input and wrap it to an object
	 */
	public void getTenantMockData() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the number of companies you want to save: ");
		int n = scan.nextInt();
		scan.nextLine();
		for (int i = 1; i <= n; i++) {
			Company company = new Company();
			Address address = new Address();
			Contact primaryContact = new Contact();
			Contact secondaryContact = new Contact();
			ArrayList<Contact> contact = new ArrayList<Contact>();

			System.out.println(i+"."+"Enter company name: ");
			String companyName = scan.nextLine();
			System.out.println();
			System.out.println("Enter company Address: ");
			System.out.println("Address Line1: ");
			String addressLine1 = scan.nextLine();
			System.out.println("Address Line2: ");
			String addressLine2 = scan.nextLine();
			System.out.println("City: ");
			String city = scan.nextLine();
			System.out.println("State: ");
			String state = scan.nextLine();
			System.out.println("ZIP: ");
			String zip = scan.nextLine();
			System.out.println();
			System.out.println("Enter company contact info: ");
			System.out.println("Enter primary contact info: ");
			System.out.println("name: ");
			String primaryContactName = scan.nextLine();
			System.out.println("phone number: ");
			String primaryContactNumber = scan.nextLine();
			System.out.println("EmailID: ");
			String primaryContactEmailId = scan.nextLine();
			System.out.println();
			System.out.println("Enter secondary contact info: ");
			System.out.println("name: ");
			String secondaryContactName = scan.nextLine();
			System.out.println("phone number: ");
			String secondaryContactNumber = scan.nextLine();
			System.out.println("EmailID: ");
			String secondaryContactEmailId = scan.nextLine();
			System.out.println("***********************************");

			company.setCompanyName(companyName);

			address.setAddressLine1(addressLine1);
			address.setAddressLine2(addressLine2);
			address.setCity(city);
			address.setState(state);
			address.setZip(zip);

			primaryContact.setName(primaryContactName);
			primaryContact.setPhoneNumber(primaryContactNumber);
			primaryContact.setEmailId(primaryContactEmailId);
			secondaryContact.setName(secondaryContactName);
			secondaryContact.setPhoneNumber(secondaryContactNumber);
			secondaryContact.setEmailId(secondaryContactEmailId);

			contact.add(primaryContact);
			contact.add(secondaryContact);

			company.setAddress(address);
			company.setContact(contact);

			tenantInformation.createTenantInformation(company);

		}
	}

	
	/**
	 * This method will display the tenant information
	 */
	public void displayTenantData() {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter addressline1 to get the tenant information: ");
		String addressLineOne = scan.nextLine();
		ArrayList<Company> tenantInfo = tenantInformation.displayTenantInfo(addressLineOne);
		System.out.println("Here's the list of all the companies with the address line 1: "+ addressLineOne);
		for(Company company: tenantInfo){
			System.out.println("Tenant Name: " + company.getCompanyName());
			System.out.println("Address:");
			System.out.println("\t\t" + company.getAddress().getAddressLine1());
			System.out.println("\t\t" + company.getAddress().getAddressLine2());
			System.out.println("\t\t" + company.getAddress().getCity());
			System.out.println("\t\t" + company.getAddress().getState() + " " + company.getAddress().getZip());
			System.out.println("Contact Info:");
			System.out.println("Primary Contact:");
			System.out.println("\t\t" + "Name: " + company.getContact().get(0).getName());
			System.out.println("\t\t" + "Phone Number: " + company.getContact().get(0).getPhoneNumber());
			System.out.println("\t\t" + "EmailId: " + company.getContact().get(0).getEmailId());
			System.out.println("Secondary Contact:");
			System.out.println("\t\t" + "Name: " + company.getContact().get(1).getName());
			System.out.println("\t\t" + "Phone Number: " + company.getContact().get(1).getPhoneNumber());
			System.out.println("\t\t" + "EmailId: " + company.getContact().get(1).getEmailId());
			System.out.println();
			System.out.println("________________________________________________________________");

		}
	}

}
