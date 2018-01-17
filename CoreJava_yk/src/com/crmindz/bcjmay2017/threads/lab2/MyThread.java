package com.crmindz.bcjmay2017.threads.lab2;


/**
 * @author Yeshwanth Konakanchi
 * This class will create two threads and run them and displays the output.
 */
public class MyThread implements Runnable{
	
   String msg = "default";

   public MyThread(String s)
   {
      msg = s;
   }

   public void run( )
   {
      System.out.println(msg);
   }

   public static void main(String args[])
   {
      new Thread(new MyThread("String1")).run();
      new Thread(new MyThread("String2")).run();
      System.out.println("end");
   }

}


/*Select 1 correct option. 

a  The program will compile and print only 'end'.   
b  It will always print 'String1'  'String2' and 'end', in that order.   
c  It will always print 'String1'   'String2' in random order followed by 'end'.   
d  It will always print 'end' first.   
e  No order is guaranteed. 

The result of this program is options b. 
It will always print 'String1' 'String2' and 'end', in that order.
*/