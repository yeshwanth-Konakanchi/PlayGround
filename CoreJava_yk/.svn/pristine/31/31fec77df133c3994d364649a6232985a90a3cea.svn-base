package com.crmindz.bcjmay2017.oops.inheritance.lab6;

/**
 * @author Yeshwanth Konakanchi
 * This class is the demo class for inheritance.
 */
public class DemoInherit {

	public static void main(String[] args) {
		Address address=new Address();
		address.setAddressLine("8321 carpenter pkwy");
		address.setCity("Irving");
		address.setState("Texas");
		address.setZip("75038");
		Hostelite hostelite=new Hostelite("Tommy", 75.6f, 'H', "CSE", 4, address, "Aaradhya", 105, "double");
		
		if(hostelite.validateStudentName())
		{
			if(hostelite.validateBranchName() && hostelite.validateExamMarks())
			{
				System.out.println("Student Id : " + hostelite.getStudentId());
				System.out.println("Student Name : " + hostelite.getStudentName());
				System.out.println("Qualifying Marks : " + hostelite.getQualifyingExamMarks());
				System.out.println("Residential Status : " + hostelite.getResidentialStatus());
				System.out.println("Current Year of Engineering : " + hostelite.getYearOfEngg());
				System.out.println("Branch Name : " + hostelite.getBranchName());
				System.out.println("Permanent Address : \n" + address.getAddressLine() + "\n" + address.getCity() + "\n"
						+ address.getState() + ", " + address.getZip());
				System.out.println();
				System.out.println("Hostel Name : " + hostelite.getHostelName());
				System.out.println("Room Number : " + hostelite.getRoomNumber());
				System.out.println("Room Type : " + hostelite.getRoomType());
				System.out.println("\n");
			}
		}
		

		Address residentAddress = new Address();
		
		residentAddress.setAddressLine("123 Greenway Dr");
		residentAddress.setCity("Irving");
		residentAddress.setState("Texas");
		residentAddress.setZip("75038");

		Address permanantAddress = new Address();
		
		permanantAddress.setAddressLine("501 Monroe ST");
		permanantAddress.setCity("Dallas");
		permanantAddress.setState("Texas");
		permanantAddress.setZip("75080");

		DayScholar dayScholar = new DayScholar("Timmy", 80.0f, 'D', "CSE", 4, residentAddress, 10);
		
		if (dayScholar.validateStudentName()) {
			if (dayScholar.validateStudentName() && dayScholar.validateExamMarks()) {
				System.out.println("Student Id : " + dayScholar.getStudentId());
				System.out.println("Student Name : " + dayScholar.getStudentName());
				System.out.println("Qualifying Marks : " + dayScholar.getQualifyingExamMarks());
				System.out.println("Residential Status : " + dayScholar.getResidentialStatus());
				System.out.println("Current Year of Engneering : " + dayScholar.getYearOfEngg());
				System.out.println("BranchName : " + dayScholar.getBranchName());
				System.out.println("Residential Address : \n" + residentAddress.getAddressLine() + "\n" + residentAddress.getCity() + "\n"
						+ residentAddress.getState() + ", " + residentAddress.getZip());
				System.out.println();
				System.out.println("Distance : " + dayScholar.getDistance());
				System.out.println("Permanent Address : \n" + permanantAddress.getAddressLine() + "\n" + permanantAddress.getCity() + "\n"
						+ permanantAddress.getState() + ", " + permanantAddress.getZip());
				System.out.println();
			}
		}
	}
}
