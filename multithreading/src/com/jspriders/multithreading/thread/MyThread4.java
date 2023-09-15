package com.jspriders.multithreading.thread;

public class MyThread4 extends Thread {

	@Override
	public void run() {
		for(int i=1; i<=5; i++) {
			System.out.println("MyThread 4 is now running.");
		}
	}
	
}
