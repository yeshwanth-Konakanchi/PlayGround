package com.crmindz.bcjmay2017.oops.inheritance.lab6;

/**
 * @author Yeshwanth Konakanchi
 * Class Student is superclass consisting of student data.
 */
public class Student {

	private int studentId;
	private String studentName;
	private float qualifyingExamMarks;
	private char residentialStatus;
	private String branchName;
	private Address permanentAddress;
	private int yearOfEngg;
	private static int counter;

	/**
	 * @param studentName
	 * @param qualifyingExamMarks
	 * @param residentialStatus
	 * @param branchName
	 * @param yearOfEngg
	 */
	public Student(String studentName, float qualifyingExamMarks, char residentialStatus, String branchName,
			int yearOfEngg) {
		
		this.studentName = studentName;
		this.qualifyingExamMarks = qualifyingExamMarks;
		this.residentialStatus = residentialStatus;
		this.branchName = branchName;
		this.yearOfEngg = yearOfEngg;
	}
	
	/**
	 * @return the studentId
	 */
	public int getStudentId() {
		return studentId;
	}

	/**
	 * @param studentId
	 *            the studentId to set
	 */
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	/**
	 * @return the studentName
	 */
	public String getStudentName() {
		return studentName;
	}

	/**
	 * @param studentName
	 *            the studentName to set
	 */
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	/**
	 * @return the qualifyingExamMarks
	 */
	public float getQualifyingExamMarks() {
		return qualifyingExamMarks;
	}

	/**
	 * @param qualifyingExamMarks
	 *            the qualifyingExamMarks to set
	 */
	public void setQualifyingExamMarks(float qualifyingExamMarks) {
		this.qualifyingExamMarks = qualifyingExamMarks;
	}

	/**
	 * @return the residentialStatus
	 */
	public char getResidentialStatus() {
		return residentialStatus;
	}

	/**
	 * @param residentialStatus
	 *            the residentialStatus to set
	 */
	public void setResidentialStatus(char residentialStatus) {
		this.residentialStatus = residentialStatus;
	}

	/**
	 * @return the branchName
	 */
	public String getBranchName() {
		return branchName;
	}

	/**
	 * @param branchName
	 *            the branchName to set
	 */
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	/**
	 * @return the permanentAddress
	 */
	public Address getPermanentAddress() {
		return permanentAddress;
	}

	/**
	 * @param permanentAddress
	 *            the permanentAddress to set
	 */
	public void setPermanentAddress(Address permanentAddress) {
		this.permanentAddress = permanentAddress;
	}

	/**
	 * @return the yearOfEngg
	 */
	public int getYearOfEngg() {
		return yearOfEngg;
	}

	/**
	 * @param yearOfEngg
	 *            the yearOfEngg to set
	 */
	public void setYearOfEngg(int yearOfEngg) {
		this.yearOfEngg = yearOfEngg;
	}

	/**
	 * @return the counter
	 */
	public static int getCounter() {
		return counter;
	}

	/**
	 * @param counter
	 *            the counter to set
	 */
	public static void setCounter(int counter) {
		Student.counter = counter;
	}

	
	/**
	 * @return true or false
	 * This method will validate the student name and return true or false.
	 */
	public boolean validateStudentName() {
		
		boolean status = false;
		
		if(getStudentName().length() >= 5 && getStudentName().length() <= 55){
			status = true;
		}
		else{
			status = false;
		}
		return status;
	}

	
	/**
	 * @return true or false
	 * This method will validate the branch name and return true or false.
	 */
	public boolean validateBranchName() {
		
		boolean status = false;
		
		if(getBranchName().equalsIgnoreCase("CSE") || getBranchName().equalsIgnoreCase("ECE") || getBranchName().equalsIgnoreCase("EEE") || getBranchName().equalsIgnoreCase("MECH")||getBranchName().equalsIgnoreCase("BIO-TECH")) {
			status =  true;
		}
		else {
			
			setBranchName("CSE"); 
			status =  true;
			
		}
		return status;	
	}
	
	
	/**
	 * @return true or false
	 * This method will validate the exam marks and return true or false.
	 */
	public boolean validateExamMarks() {
		
		boolean status = false;
		
		if(getQualifyingExamMarks() <= 100  && getQualifyingExamMarks() >= 65) {
			status =  true;
		}else {
			status = false;
		}
		
		return status;
	}
	
}

