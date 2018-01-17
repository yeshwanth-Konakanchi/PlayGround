package com.crmindz.bcjmay2017.oops.inheritance.lab6;


/**
 * @author Yeshwanth Konakanchi
 * This class will inherit the Student class.
 */
public class Hostelite extends Student {

	private String hostelName;
	private int roomNumber;
	private String roomType;
	private Address hostelAddress;
	
	/**
	 * @param studentName
	 * @param qualifyingExamMarks
	 * @param residentialStatus
	 * @param branchName
	 * @param yearOfEngg
	 * @param hostelAddress
	 * @param hostelName
	 * @param roomNum
	 * @param roomType
	 */
	public Hostelite( String studentName, float qualifyingExamMarks, char residentialStatus, String branchName,
			int yearOfEngg, Address hostelAddress, String hostelName, int roomNum, String roomType ) {
		super(studentName, qualifyingExamMarks, residentialStatus, branchName, yearOfEngg);
		this.hostelName = hostelName;
		this.roomNumber = roomNum;
		this.roomType = roomType;
		this.setHostelAddress(hostelAddress);
	}
	
	/**
	 * @return the hostelName
	 */
	public String getHostelName() {
		return hostelName;
	}
	/**
	 * @param hostelName the hostelName to set
	 */
	public void setHostelName(String hostelName) {
		this.hostelName = hostelName;
	}
	/**
	 * @return the roomNumber
	 */
	public int getRoomNumber() {
		return roomNumber;
	}
	/**
	 * @param roomNumber the roomNumber to set
	 */
	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}
	/**
	 * @return the roomType
	 */
	public String getRoomType() {
		return roomType;
	}
	/**
	 * @param roomType the roomType to set
	 */
	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}

	public Address getHostelAddress() {
		return hostelAddress;
	}

	public void setHostelAddress(Address hostelAddress) {
		this.hostelAddress = hostelAddress;
	}
	
}
