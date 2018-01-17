package com.crmindz.bcjmay2017.oops.classes.simple.lab2;

/**
 * @author Yeshwanth Konakanchi
 *This is a demo class to demonstrate the setter and getter methods of Student class
 */
public class CourseManagement {
	
	public static void main(String[] args) {
		
		Student student = new Student();
		int studentId = 11211;
		char studentType = 'F';
		student.setStudentID(studentId);
		student.setStudentType(studentType);
		
		System.out.println(student.getStudentID());
		System.out.println(student.getStudentType());
		
		
	}

}
