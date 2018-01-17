package com.crmindz.bcjmay2017.threads.lab7;


/**
 * @author Yeshwanth Konakanchi
 * This class implements the Runnable interface and contains a constructor and 
 * overrides the run method.
 */
class MyRunnable implements Runnable
{
	MyRunnable(String name)
	{
		new Thread(this, name).start();
	}
	public void run()
	{
		System.out.println(Thread.currentThread().getName());
	}
}

public class TestClass
{
	public static void main(String[] args)
	{
		Thread.currentThread().setName("MainThread");
		MyRunnable mr = new MyRunnable("MyRunnable");
		mr.run();
	}
}
   
/*Select 1 correct option. 
a  MainThread   
b  MyRunnable   
c  "MainThread" will be printed twice.   
d  "MyRunnable" will be printed twice.   
e  It will print "MainThread" as well as "MyRunnable"  

The option is e. It will print "MainThread" as well as "MyRunnable"
 */
