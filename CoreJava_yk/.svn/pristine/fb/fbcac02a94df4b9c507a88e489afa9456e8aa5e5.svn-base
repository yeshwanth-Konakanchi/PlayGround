package com.crmindz.bcjmay2017.oops.classes.simple.lab1.lab1part2;

/**
 * @author Yeshwanth Konakanchi
 *This class will generate a random password
 */
public class Password {

	/**
	 * @return
	 * This method will generate a random password
	 */
	public String generateAPassword() {

		String password = "";

		for (int i = 0; i < 4; i++) {

			char a = (char) (Math.random() * 15 + 'a');
			int num = (int) (Math.random() * 10);
			String s = Character.toString(a);
			String number = Integer.toString(num);
			password = password + s + number;
		}

		return password;
	}

	public static void main(String[] args) {

		Password passwrd = new Password();
		
		String password = passwrd.generateAPassword();
		
		System.out.println(password);
	}

}
