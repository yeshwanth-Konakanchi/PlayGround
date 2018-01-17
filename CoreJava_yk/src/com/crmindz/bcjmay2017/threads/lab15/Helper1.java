package com.crmindz.bcjmay2017.threads.lab15;


/**
 * @author Yeshwanth Konakanchi
 * This class implements the runnable interface.
 */
public class Helper1 implements Runnable {
	
	 int x, y, result;

	  public Helper1(int e, int f) {
	    x = e;
	    y = f;
	  }

	  public int getResult() {
	    return result;
	  }

	  public void run() {
	    result = x + y;
	  } 

}
