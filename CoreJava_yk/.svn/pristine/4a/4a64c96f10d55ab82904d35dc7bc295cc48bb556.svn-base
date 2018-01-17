package com.crmindz.bcjmay2017.oops.classes.simple.lab6;

public class Ticket {
	
	private int startPoint;
	private int endPoint;
	
	public Ticket(int startPoint, int endPoint){
		
		this.startPoint = startPoint;
		this.endPoint = endPoint;
		
	}

	public int getStartPoint() {
		return startPoint;
	}

	public int getEndPoint() {
		return endPoint;
	}

	public boolean validateTravelPoints(){
		
		if (startPoint>0 && endPoint>0 && startPoint<endPoint){
			return true;
		}
		
		else{
		
			return false;
		}
	}
	
	public int calculateTicketAmt(){
		
		return (endPoint - startPoint)  * 20;
	}
	
}
