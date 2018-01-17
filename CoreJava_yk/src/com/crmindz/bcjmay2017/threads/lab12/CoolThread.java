package com.crmindz.bcjmay2017.threads.lab12;


/**
 * @author Yeshwanth Konakanchi
 * This class inherits the Thread class and contains a constructor and run method.
 */
class CoolThread extends Thread
{
	String id = "";
	
	public CoolThread(String s){ 
		this.id = s; 
	}
	
	public void run()
	{
		System.out.println(id+"End");
	}
	
	public static void main(String args [])
	{
		Thread t1 = new CoolThread("AAA");
		t1.setPriority(Thread.MIN_PRIORITY);

		Thread t2 = new CoolThread("BBB");
		t2.setPriority(Thread.MAX_PRIORITY);

		t1.start(); 
	}
}

/*Select 1 correct option. 
a  "AAA End" will always be printed before "BBB End".   
b  "BBB End" will always be printed before "AAA End".   
c  The program will not compile.   
d  THe program will throw an exception at runtime.   
e  None of the above.  

The option is e None of the above. Only AAA End wil print because the second thread
is never started.
*/