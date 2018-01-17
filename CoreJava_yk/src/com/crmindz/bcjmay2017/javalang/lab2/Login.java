package com.crmindz.bcjmay2017.javalang.lab2;


/**
 * @author Yeshwanth Konakanchi
 * This class contains two arrays of usernames and passwords. Username and Password of the user.
 * It validates the username and password from the arrays.
 */
public class Login {

	private static String[] usernames;
	private static String[] passwords;

	private String username;
	private String password;
	
	/**
	 *Static block initializes the arrays. 
	 */
	static {

		usernames = new String[] { "admin", "finance", "student" };
		passwords = new String[] { "Admin", "Finance", "Student" };
	}

	public Login() {

		username = "student";
		password = "Student";
	}

	/**
	 * This method compares the username and password with the arrays of usernames and passwords.
	 */
	public boolean validateLogin() {

		for (int i = 0; i < usernames.length; i++) {
			if (this.username.equalsIgnoreCase(Login.usernames[i]) && this.password.equals(Login.passwords[i])) {

				return true;

			}
		}
		return false;
	}
}
