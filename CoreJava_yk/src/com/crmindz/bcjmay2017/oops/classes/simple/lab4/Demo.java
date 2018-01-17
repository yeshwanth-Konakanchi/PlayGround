package com.crmindz.bcjmay2017.oops.classes.simple.lab4;

/**
 * @author Yeshwanth Konakanchi
 *This is a demo class to set and print the properties of student class
 */
public class Demo {
	
	public static void main(String[] args) {
		
		Student student = new Student();
		
		student.setStudentId(1001);
		student.setQualifyingMarks(95.0f);
		student.setResidentialStatus('D');
		student.setYearOfEngg(2);
		
		System.out.println("StudentID: "+student.getStudentId());
		System.out.println("Qualifying Marks: "+student.getQualifyingMarks());
		System.out.println("Residential Status: "+student.getResidentialStatus());
		System.out.println("Current Year of Engineering: "+student.getYearOfEngg());
		
	}

}
