package com.crmindz.bcjmay2017.oops.inheritance.lab6;

/**
 * @author Yeshwanth Konakanchi
 * This class will inherit the Student class.
 */
public class DayScholar extends Student {

	private Address residentialAddress;
	private float distance;
	
	/**
	 * @param studentName
	 * @param qualifyingExamMarks
	 * @param residentialStatus
	 * @param branchName
	 * @param yearOfEngg
	 * @param residentialAddress
	 * @param distance
	 */
	public DayScholar(String studentName, float qualifyingExamMarks, char residentialStatus, String branchName,
			int yearOfEngg, Address residentialAddress, float distance) {
		super(studentName, qualifyingExamMarks, residentialStatus, branchName, yearOfEngg);
		this.residentialAddress = residentialAddress;
		this.distance = distance;
	}
	
	/**
	 * @return the residentialAddress
	 */
	public Address getResidentialAddress() {
		return residentialAddress;
	}
	/**
	 * @param residentialAddress the residentialAddress to set
	 */
	public void setResidentialAddress(Address residentialAddress) {
		this.residentialAddress = residentialAddress;
	}
	/**
	 * @return the distance
	 */
	public float getDistance() {
		return distance;
	}
	/**
	 * @param distance the distance to set
	 */
	public void setDistance(float distance) {
		this.distance = distance;
	}
	
}
