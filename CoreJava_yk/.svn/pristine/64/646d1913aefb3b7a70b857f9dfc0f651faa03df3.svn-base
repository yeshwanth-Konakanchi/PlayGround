package com.crmindz.bcjmay2017.oops.classes.medium.lab7;

/**
 * @author Yeshwanth Konakanchi
 *
 */
public class Checks {

	/**
	 * Check baggageamount
	 * @param t
	 * @return
	 */
	public boolean checkBaggage(Traveller t){
		
		int baggageAmount = t.getBaggageAmount();
		
		if (baggageAmount >= 0 && baggageAmount <= 40){
			
			return true;
		}
		else {
			
			return false;
		}
	}
	
	
	/**
	 * Check immigration 
	 * @param t
	 * @return
	 */
	public boolean checkImmigration(Traveller t) {
		
		int expiryYear = t.getExpiryYear();
		
		if(expiryYear >= 2001 && expiryYear <= 2025){
			
			return true;
		}
		else {
			
			return false;
		}
	}
	
	/**
	 * Check Security status
	 * @param t
	 * @return
	 */
	public boolean checkSecurity(Traveller t) {
		
		boolean status = t.isNocStatus();
		
		if (status) {
			
			return true;
		}
		else {
			
			return false;
		}
	}
}
