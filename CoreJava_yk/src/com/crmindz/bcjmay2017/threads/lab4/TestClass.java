package com.crmindz.bcjmay2017.threads.lab4;


/**
 * @author Yeshwanth Konakanchi
 * This class will print two statements and starts running the loop 
 * which will never end the program.
 */
public class TestClass extends Thread
{
   public void run()
   {
      for(;;);
   }

   public static void main(String args[])
   {
      System.out.println("Starting main");
      new TestClass().start();
      System.out.println("Main returns");
   }

}
 
/*Select 3 correct options 
a  It will print "Starting Main"   
b  It will print "Main returns"   
c  It will not print "Main returns"   
d  The program will never exit.   
e  main() method will never return   

The correct options are a,b,d
*/
