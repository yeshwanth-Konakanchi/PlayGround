package com.crmindz.bcjmay2017.oops.overloading.lab2;

import java.util.Date;

/**
 * @author Yeshwanth Konakanchi
 * This class will demonstrate constructor overloading.
 */
public class Employee {

	private String firstName;
	private String lastName;
	private int employeeId;
	private Date dateOfBirth;

	/**
	 * @param firstName
	 */
	public Employee(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @param firstName
	 * @param lastName
	 */
	public Employee(String firstName, String lastName) {
		this(firstName);
		this.lastName = lastName;
	}

	/**
	 * @param firstName
	 * @param lastName
	 * @param employeeId
	 */
	public Employee(String firstName, String lastName, int employeeId) {
		this(firstName, lastName);
		this.employeeId = employeeId;
	}

	/**
	 * @param firstName
	 * @param lastName
	 * @param employeeId
	 * @param dateOfBirth
	 */
	public Employee(String firstName, String lastName, int employeeId, Date dateOfBirth) {
		this(firstName, lastName, employeeId);
		this.dateOfBirth = dateOfBirth;
	}

	public static void main(String[] args) {

		Employee emp1 = new Employee("Siva");
		Employee emp2 = new Employee("Siva", "Yarram");
		Employee emp3 = new Employee("Siva", "Yarram", 27);
		@SuppressWarnings("deprecation")
		Employee emp4 = new Employee("Siva", "Yarram", 27, new Date("07/12/2017"));

		System.out.println(emp1.firstName);

		System.out.println(emp2.firstName + " " + emp2.lastName);

		System.out.println(emp3.firstName + " " + emp3.lastName + " " + emp3.employeeId);

		System.out.println(emp4.firstName + " " + emp4.lastName + " " + emp4.employeeId + " " + emp4.dateOfBirth);
	}

}
