package com.crmindz.bcjmay2017.threads.lab3;


/**
 * @author Yeshwanth Konakanchi
 * This is a parent class Base which extends Thread class.
 */
class Base extends Thread
{
	static int k = 10;
}

/**
 * @author Siva Yarram
 * This is a child class of Base class which has a method that runs into infinite loop.
 */
class Incrementor extends Base
{
	public void run()
	{
		for(; k>0; k++)
		{
			System.out.println("IRunning...");
		}
	}
}

/**
 * @author Siva Yarram
 * This is a child class of Base class which has a method that runs into infinite loop.
 */
class Decrementor extends Base
{
	public void run()
	{
		for(; k>0; k--)
		{
			System.out.println("DRunning...");
		}
	}
}

/**
 * @author Siva Yarram
 * This is a test class which will create two objects of child classes and
 * invokes them to run.
 */
public class TestClass
{
	public static void main(String args[]) throws Exception
	{
		Incrementor i = new Incrementor();
		Decrementor d = new Decrementor();
		i.start();
		d.start();
	}
}

/*The following program will always terminate. 

Select 1 correct option. 
a  True   
b  False 

The answer is option b. False. This program will not terminate.*/
