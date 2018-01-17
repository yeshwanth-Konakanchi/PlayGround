package com.crmindz.bcjmay2017.threads.lab9;


/**
 * @author Yeshwanth Konakanchi
 * This class implements the Runnable interface and contains a constructor and 
 * overrides the run method.
 */
class MyClass implements Runnable
{
	int n = 0;
	
	public MyClass(int n){ 
		this.n = n; 
	}
	
	public static void main(String[] args)
	{
		new MyClass(2).run();
		new MyClass(1).run();
	}
	
	public void run()
	{
		for(int i=0; i<n; i++)
		{
			System.out.println("Hello World");
		}
	}
}

/*What is true about above program? 
Select 1 correct option. 
a  It'll  print "Hello World" twice.   
b  It'll keep printing "Hello World".   
c  2 new threads are created by the program.   
d  1 new thread is created by the program.   
e  None of these.   

The option is e. None of these. The output is it will print Hello World thrice.
*/