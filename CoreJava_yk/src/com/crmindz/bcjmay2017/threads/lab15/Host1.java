package com.crmindz.bcjmay2017.threads.lab15;


/**
 * @author Yeshwanth Konakanchi
 */
public class Host1 {
	
	  public int sum(int a, int b, int c, int d) {
		  
	    Helper1 he = new Helper1(c,d);
	    Thread aux = new Thread(he);
	    
	    aux.start();
	    
	    int temp = a+b;
	    
//	    try{
//	      aux.join();
//	    }
//	    catch(InterruptedException e) { 
//	    	
//	    }
	    
	    temp = temp + he.getResult();
	    
	    return temp;
	  }

}