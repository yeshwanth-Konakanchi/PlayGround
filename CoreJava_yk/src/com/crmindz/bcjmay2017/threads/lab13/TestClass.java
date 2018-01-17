package com.crmindz.bcjmay2017.threads.lab13;


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

/**
 * @author Yeshwanth Konakanchi
 * This class creates threads and object of MyRunnable class and invoke run method 
 * overrides the run method.
 */
public class TestClass
{
	public static void main(String[] args)
	{
		Thread.currentThread().setName("First");
		MyRunnable mr = new MyRunnable("MyRunnable");
//		System.out.println("HI");
//		System.out.println("HI");
//		System.out.println("HI");
//		System.out.println("HI");
//		System.out.println("HI");
		mr.run();
		Thread.currentThread().setName("Second");
		mr.run();
	}
}

/*Select 1 correct option. 
a  It will always print: First, MyRunnable, Second.   
b  It will always print: MyRunnable, First, Second.   
c  It will always print: First, Second,  MyRunnable.   
d  It may print First, Second and MyRunnable in any order.   
e  Second will always be printed after First.  

The option is d It may print First, Second and MyRunnable in any order.
*/