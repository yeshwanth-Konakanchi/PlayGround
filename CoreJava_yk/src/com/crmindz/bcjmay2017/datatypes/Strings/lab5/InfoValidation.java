package com.crmindz.bcjmay2017.datatypes.Strings.lab5;

/**
 * @author Yeshwanth Konakanchi
 * This class validates the phone number, IP address and EmailID.
 */
public class InfoValidation{
	
 public static void main(String[] args) {
	 
	 System.out.println(validatePhone("913-279-1322"));
	 System.out.println(validateIPAddress("127.0.0.25"));
 }
 
 /**
  * @param phoneNo
  * Validates the phone number using REGEX. 
  */
 public static boolean validatePhone(String phoneNo){
	 
	 return phoneNo.matches("\\d{3}[-\\.\\s]\\d{3}[-\\.\\s]\\d{4}");
 }
 
 /**
  * @param ip
  * Validates the IP Address using REGEX.
  */
 public static boolean validateIPAddress(String ip){
	 
	 return ip.matches("(([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.){3}([01]?\\d\\d?|2[0-4]\\d|25[0-5])");
 }
}

