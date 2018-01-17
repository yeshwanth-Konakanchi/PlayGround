package com.crmindz.bcjmay2017.oops.classes.medium.lab5;

import java.util.Arrays;

/**
 * @author Yeshwanth Konakanchi
 *Class Point with coordinated x and y and their behaviour
 */
public class Point {

	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	private int x;
	private int y;
	
	
	/**
	 * Calculate the distance of the given point from another point
	 * @param temp
	 * @return
	 */
	public int distanceFromAnotherPoint(int[] temp ){
		
		int[] point1 = new int[2];
		point1[0] = getX();
		point1[1] = getY();
		
         
		int dist = 0;
		
		dist =  (int)Math.sqrt((point1[0]-temp[0])*(point1[0]-temp[0]))+((point1[1]-temp[1])*(point1[1]-temp[1]));
		
		return dist;
	}
	
	
	/**
	 * Claculate the slope between 2 points
	 * @param temp
	 * @return
	 */
	public int slopeWithAnotherPoint(int[] temp){
		
		int[] point1 = new int[2];
		point1[0] = getX();
		point1[1] = getY();
		
		int slope = (int)(point1[1] - temp[1])/point1[0] - temp[0];
		
		return slope;
	}
	
	
	/**
	 * Check if the points are collinear
	 * @param temp
	 * @param temp1
	 * @return
	 */
	public boolean isCollinear(int[] temp,int[] temp1) {
		
		int[] point1 = new int[2];
		
		point1[0] = getX();
		point1[1] = getY();
		
		System.out.println(Arrays.toString(point1));
		System.out.println(Arrays.toString(temp));
		System.out.println(Arrays.toString(temp1));
		
		
		int slope1 = (point1[1] - temp[1])/(point1[0] - temp[0]);
		System.out.println(slope1 + "--slope1");
		
		int slope2 = (point1[1] - temp1[1])/(point1[0] - temp1[0]);
		System.out.println(slope2 + "--slope2");
		
		int slope3 = (temp1[1] - temp[1]) / (temp1[0] - temp[0]);
		System.out.println(slope3 + "--slope3");
		
		if ((slope1 == slope2) && (slope2 == slope3)){
			return true;
		}
		else {
			return false;
		}
		
	}
	
	/**
	 * Check the midpoint of 2 points
	 * @param temp
	 * @return
	 */
	public int[] midPoint(int[] temp ) {
		
		int[] point1 = new int[2];
		point1[0] = getX();
		point1[1] = getY();
		
		int[] midpoint = new int[2];
		 midpoint[0] = (int) ((point1[0] + temp[0])/2);
		 midpoint[1] = (int) ((point1[1] + temp[1])/2);
		return midpoint;
	}
	
	/**
	 * Calculate the midpoint from origin
	 * @return
	 */
	public int distanceFromOrigin(){
		
		int dist =  (int)Math.sqrt((getX()*getX())+(getY()*getY()));
		
		return dist;
	
	}
	
	/**
	 * Check if the point is vertical
	 * @return
	 */
	public boolean isVertical(){
		
		boolean value = false;
		
		if (getX() == 0){
			
			value = true;
		}
		
		return value;
	}
	
	
	/**
	 * Check if the point is horizontal
	 * @return
	 */
	public boolean isHorizontal(){
		
		boolean value = false;
		
		if (getY() == 0){
			
			value = true;
		}
		
		return value;
	}
	
	/**
	 * Check in which quadrant the point lies in
	 * @return
	 */
	public String quadrant(){
		
		int[] point = new int[2];
		
		point[0] = getX();
		point[1] = getY();
		
		String str = null;
		
		if (point[0] >= 0 && point[1] >= 0) 
			str = "Quadrant 1";
		else if (point[0] <= 0 && point[1] >= 0)
			str= "Quadrant2";
		else if (point[0] <= 0 && point[1] <= 0)
			str= "Quadrant3";
		else if (point[0] >= 0 && point[1] <= 0)
			str= "Quadrant4";
		
		return str;
	}
	
	
}