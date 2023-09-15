package com.jspriders.multithreading.main;
import com.jspriders.multithreading.thread.MyThread1;

public class ThreadMain1 {
	public static void main(String[] args) {
		MyThread1 myThread1 = new MyThread1();
		myThread1.start();
	}

}
