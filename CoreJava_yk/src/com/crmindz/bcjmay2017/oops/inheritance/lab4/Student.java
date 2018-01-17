package com.crmindz.bcjmay2017.oops.inheritance.lab4;

/**
 * @author Yeshwanth Konakanchi
 * This class has properties for the student and setters and getters.
 */
public class Student {
	private String studentName;
	 private int id;
	 private String schoolName;
	 private String currentYear;
	 
	/**
	 * @return the studentName
	 */
	public String getStudentName() {
		return studentName;
	}
	/**
	 * @param studentName the studentName to set
	 */
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the schoolName
	 */
	public String getSchoolName() {
		return schoolName;
	}
	/**
	 * @param schoolName the schoolName to set
	 */
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	/**
	 * @return the currentYear
	 */
	public String getCurrentYear() {
		return currentYear;
	}
	/**
	 * @param currentYear the currentYear to set
	 */
	public void setCurrentYear(String currentYear) {
		this.currentYear = currentYear;
	}

}
