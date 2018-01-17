package com.crmindz.bcjmay2017.threads.lab11;


/**
 * @author Yeshwanth Konakanchi
 * This class implements the Runnable interface and overrides the run method.
 */
public class TestClass implements Runnable {
	
	int x = 5;

	public void run() {
		this.x = 10;
	}

	public static void main(String[] args) {
		TestClass tc = new TestClass();
		new Thread(tc).start(); // 1
		System.out.println(tc.x);
	}
}

/*
 * What will it print when run?
 * 
 * 
 * Select 1 correct option. a 5 b 10 c It will not compile. d Exception at
 * Runtime. e The output cannot be determined.
 * 
 * The option is a 5.
 */