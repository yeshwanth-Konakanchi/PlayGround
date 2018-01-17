package com.crmindz.bcjmay2017.oops.classes.medium.lab4;

/**
 * @author Yeshwanth Konakanchi
 *Class Demo to demonstrate the working of student class
 */
public class Demo {

	public static void main(String rags[]) {
		
		System.out.println("Student 1");
		Student s1 = new Student();

		s1.setStudentId(1001);
		s1.setStudentName("Jackson");
		s1.setQualifyingExamMarks(95.0f);
		s1.setResidentialStatus('D');
		s1.setYearOfEngg(2);
		s1.setBranchName("cse");

		if (s1.validateBranchName() && s1.validateStudentName()) {

			if (!s1.validateExamMarks()) {
				System.out.println("Invalid marks, the range of marks is between 65 and 100");
			} else {
				System.out.println("Student id is: " + s1.getStudentId());
				System.out.println("Student name is: " + s1.getStudentName());
				System.out.println("Qualifying marks are: " + s1.getQualifyingExamMarks());
				System.out.println("Residential status is: " + s1.getResidentialStatus());
				System.out.println("Year of engineering is: " + s1.getYearOfEngg());
			}
		}
		
		System.out.println();
		System.out.println("Student 2");
		
		Student s2 = new Student();

		s2.setStudentId(1002);
		s2.setStudentName("Jen");
		s2.setQualifyingExamMarks(68.0f);
		s2.setResidentialStatus('H');
		s2.setYearOfEngg(3);
		s2.setBranchName("ABC");

		if (s2.validateStudentName() && s2.validateBranchName() ) {
			
			if (!s2.validateExamMarks()) {
				System.out.println("Invalid marks, the range of marks is between 65 and 100");
			} else {
				System.out.println("Student id is: " + s2.getStudentId());
				System.out.println("Student name is: " + s2.getStudentName());
				System.out.println("Qualifying marks are: " + s2.getQualifyingExamMarks());
				System.out.println("Residential status is: " + s2.getResidentialStatus());
				System.out.println("Year of engineering is: " + s2.getYearOfEngg());
			}
		}
		
		
	}
}