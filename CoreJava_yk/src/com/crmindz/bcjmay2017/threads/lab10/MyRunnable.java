package com.crmindz.bcjmay2017.threads.lab10;

/**
 * @author Yeshwanth Konakanchi
 * This class implements the Runnable interface.
 */
/*class MyRunnable implements Runnable
{
	public static void main(String[] args)
	{
		new Thread( new MyRunnable(2) ).start();
	}
	
	public void run(int n)
	{
		for(int i=0; i<n; i++)
		{
			System.out.println("Hello World");
		}
	}

}*/


/*What will be the output when this program is compiled and run from the command line? 
Select 1 correct option. 
a  It'll  print "Hello World" once.   
b  It'll print "Hello World" twice.   
c  This program will not even compile.   
d  This will compile but will throw an exception at runtime.   
e  It will compile and run but it will not print anything.   

The option is c. This program will not even compile. Because the class is 
implementing the Runnable interface and not overriding the run method.
Either it has to override the run method or it must be abstract class.
*/