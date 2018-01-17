package com.crmindz.bcjMay2017.multithreading.testRunStart;

class Thread1 extends Thread{  
public void run(){  
System.out.println("thread is running...");
System.out.println("thread thread"); 
System.out.println("thread thread thread"); 
System.out.println("thread thread thread thread"); 
System.out.println("thread thread thread thread thread"); 
System.out.println("thread thread thread thread thread thread"); 
yo();
}  

public void yo(){
	System.out.println("yo yo");
}
public static void main(String args[]){  
	Thread1 t1=new Thread1(); 
//	Thread2 t2=new Thread2();
	t1.start();  
//	t2.start(); 

 }  
}  
