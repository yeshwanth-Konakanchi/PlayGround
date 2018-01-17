package com.crmindz.bcjmay2017.oops.classes.medium.lab1;

/**
 * @author Yeshwanth Konakanchi
 *Class to show the working of invoice entity class
 */
public class InvoiceDemo {

	public static void main(String[] args) {
		
		Invoice i = new Invoice("123", "Pipe", 2, 20.50);
		
		double amount = i.getInvoiceAmount();
		
		System.out.println("Amount is " + amount);
		
		i.setItemPrice(-10.0);
		i.setQuantityOfItem(-5);
		
		double amount1 = i.getInvoiceAmount();
		
		System.out.println("Amount is " + amount1);

	}

}