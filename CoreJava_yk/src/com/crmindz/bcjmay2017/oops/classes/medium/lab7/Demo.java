package com.crmindz.bcjmay2017.oops.classes.medium.lab7;

/**
 * @author Yeshwanth Konakanchi
 *
 */
public class Demo {
	public static void main(String[] args) {

		Traveller t = new Traveller();
		Checks c = new Checks();
		t.setBaggageAmount(35);
		t.setExpiryYear(2019);
		t.setTravellerId(1001);
		t.setNocStatus(true);

		boolean chkBaggage = c.checkBaggage(t);
		boolean chkImmigration = c.checkImmigration(t);
		boolean chkSecurity = c.checkSecurity(t);

		if (chkBaggage && chkImmigration && chkSecurity) {

			System.out.println("Allow Traveller to fly!”");
		} else {

			System.out.println("Detain Traveller for Re-checking!");
		}
	}
}
