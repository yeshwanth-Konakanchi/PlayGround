package com.crmindz.bcjmay2017.oops.classes.medium.lab4;

/**
 * @author Yeshwanth Konakanchi
 *Class to create an entity student and demonstrate the implementation of
 * setter and getters
 */
public class Student {

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public float getQualifyingExamMarks() {
		return qualifyingExamMarks;
	}

	public void setQualifyingExamMarks(float qualifyingExamMarks) {
		this.qualifyingExamMarks = qualifyingExamMarks;
	}

	public char getResidentialStatus() {
		return residentialStatus;
	}

	public void setResidentialStatus(char residentialStatus) {
		this.residentialStatus = residentialStatus;
	}

	public int getYearOfEngg() {
		return yearOfEngg;
	}

	public void setYearOfEngg(int yearOfEngg) {
		this.yearOfEngg = yearOfEngg;
	}

	private int studentId;
	private float qualifyingExamMarks;
	private char residentialStatus;
	private int yearOfEngg;
	private String studentName;
	private String branchName;

	/**
	 * Method to validate the studentName.
	 */
	public boolean validateStudentName() {

		if (studentName.length() > 5 && studentName.length() < 25) {
			
			return true;
		} else {
			System.out.println("Invalid length for name");
			return false;
		}
	}

	/**
	 * Method validates the branch name.
	 */
	public boolean validateBranchName() {

		if (branchName.equalsIgnoreCase("CSE") || branchName.equalsIgnoreCase("ECE")
				|| branchName.equalsIgnoreCase("EEE") || branchName.equalsIgnoreCase("MECH")
				|| branchName.equalsIgnoreCase("Bio-Tech")) {
			return true;
		} else {
			System.out.println("Not a known branch name setting to CSE");
			setBranchName("CSE");
			return true;
		}
	}

	/**
	 * Method to validate the exam marks.
	 */
	public boolean validateExamMarks() {

		if (getQualifyingExamMarks() < 65 || getQualifyingExamMarks() > 100) {

			return false;
		} else {
			
			return true;
		}
	}

}
