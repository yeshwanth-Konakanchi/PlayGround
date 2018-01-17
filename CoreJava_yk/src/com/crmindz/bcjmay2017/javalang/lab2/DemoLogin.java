package com.crmindz.bcjmay2017.javalang.lab2;

/**
 * @author Yeshwanth Konakanchi
 * This class invokes the validateLogin method in Login class and prints the status of the login.
 */
public class DemoLogin {

	public static void main(String rags[]) {

		Login login = new Login();

		if (login.validateLogin()) {
			System.out.println("Login Successful");
		} 
		else {
			System.out.println("Login Denied");
		}
	}
}
