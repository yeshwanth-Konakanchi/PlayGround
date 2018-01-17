package com.crmindz.bcjmay2017.oops.classes.medium.lab1;

/**
 * @author Yeshwanth Konakanchi
 *voice entity class  for a hardware store
 */
public class Invoice {

	public String getPartNum() {
		return partNum;
	}

	public void setPartNum(String partNum) {
		this.partNum = partNum;
	}

	public String getPartDesc() {
		return partDesc;
	}

	public void setPartDesc(String partDesc) {
		this.partDesc = partDesc;
	}

	public int getQuantityOfItem() {
		return quantityOfItem;
	}

	public void setQuantityOfItem(int quantityOfItem) {
		this.quantityOfItem = quantityOfItem;
	}

	public double getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(double itemPrice) {
		this.itemPrice = itemPrice;
	}

	private String partNum ;
	private String partDesc ;
	private int quantityOfItem ;
	private double itemPrice ;
	
	public Invoice(String partNum, String partDesc, int quantityOfItem, double itemPrice) {
		
		this.partNum = partNum;
		this.partDesc = partDesc;
		this.quantityOfItem = quantityOfItem;
		this.itemPrice = itemPrice;
	}
	
	/**
	 * Method to calculate the invoice amount
	 * @return
	 */
	public double getInvoiceAmount(){
		int quantity = getQuantityOfItem();
		double price = getItemPrice();
		
		if (quantity < 0){
			quantity = 0;
		}
		if (price < 0) {
			price = 0.0;
		}
		
		double amount = quantity*price;
		
		return amount;
	}
	
	
	
}

