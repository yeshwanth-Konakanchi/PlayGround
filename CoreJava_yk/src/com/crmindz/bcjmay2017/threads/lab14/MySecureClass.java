package com.crmindz.bcjmay2017.threads.lab14;


/**
 * @author Yeshwanth Konakanchi
 * This class has two synchronized methods
 */
public class MySecureClass
{
	public synchronized void doALotOfStuff(){
		try {
			Thread.sleep(10000);
		} catch(Exception e){ }
	}
	public synchronized void doSmallStuff(){
		System.out.println("done");
	}
}

/*Assume that there are two threads. Thread one is executing the doALotOfStuff() method and has just 

executed LINE 1. Now, Thread two decides to call doSmallStff() method on the same object. 

What will happen? 
Select 1 correct option. 
a  done will be printed immediately.          
b  done will not be printed until about 10 seconds.   
c  done will never be printed.          
d  An IllegalMonitorStateException will be thrown.          
e  An IllegalThreadStateException will be thrown.   

The option is b done will not be printed until about 10 seconds.
*/