package com.jspriders.multithreading.main;

import com.jspriders.multithreading.thread.MyThread6;

public class ThreadMain5 {

	public static void main(String[] args) {
		MyThread6 myThread6 = new MyThread6();
		Thread thread = new Thread(myThread6);
		thread.setName("Thread 6");
		thread.setPriority(3);
		thread.start();
	}
}
