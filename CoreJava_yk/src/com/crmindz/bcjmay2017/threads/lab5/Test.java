package com.crmindz.bcjmay2017.threads.lab5;


/**
 * @author Yeshwanth Konakanchi
 * This class will inherit Thread class and will create two threads and start them.
 */
public class Test extends Thread
{
   String msg = "default" ;
   public Test(String s)
   {
      msg = s;
   }
   public void run()
   {
      System.out.println(msg);
   }
   public static void main(String args[])
   {
      new Test("String1").start();
      new Test("String2").start();
      System.out.println("end");
   }
}

/*Select 1 correct option. 
a  The program will fail to compile.   
b  It will always print 'String1'  'String2' and 'end', in that order.   
c  It will always print 'String1'   'String2' in random order followed by 'end'.   
d  It will always print 'end' first.   
e  No order is guaranteed.   

The correct option is e. No order is guaranteed
*/

