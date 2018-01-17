package com.crmindz.bcjmay2017.datatypes.Strings.lab3;

import java.util.Scanner;

/**
 * @author Yeshwanth Konakanchi 
 * This class will perform the email validations
 *
 */
public class EmailCheck {
	private String emailID;

	public String getEmailID() {
		return emailID;
	}

	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}

	/**
	 * @param emailId
	 *            This method will perform email validations and displays error
	 *            messages if found based on the given rules
	 */
	public void validateEmailId(String emailId) {

		if (emailId.length() > 3 && emailId.length() < 20) {
			if (emailId.contains("@")) {
				String[] splitEmailId = emailId.split("@");
				String emailIdSubstring1 = splitEmailId[1];
				String emailIdSubstring0 = splitEmailId[0];
				int j = 0;
				int k = 0;
				int l = 0;
				int m = 0;
				for (int i = 0; i < emailIdSubstring1.length(); i++) {
					if (emailIdSubstring1.charAt(i) == '.') {
						j++;
					}
				}
				if (j > 0 && j < 3) {
					for (int i = 0; i < emailIdSubstring0.length(); i++) {
						if (Character.isUpperCase(emailIdSubstring0.charAt(i))) {
							k++;
						}
						if (Character.isLowerCase(emailIdSubstring0.charAt(i))) {
							l++;
						}
						if (emailIdSubstring0.charAt(i) == '_') {
							m++;
						}
					}
					if (k > 0 && l > 0 && m > 0) {
						if (Character.isUpperCase(emailIdSubstring0.charAt(0))) {
							System.out.println("Email Id is VALID!");
						} else
							System.out.println("Invalid Case of First Letter");
					} else
						System.out.println("Invalid Combination for username");
				} else
					System.out.println("Invalid Position of Special Characters");

			} else
				System.out.println("Invalid Position of Special Characters");

		}

		else
			System.out.println("Invalid Length of emailId");
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String Id = scan.next();
		EmailCheck email = new EmailCheck();
		email.validateEmailId(Id);

		scan.close();
	}
}
