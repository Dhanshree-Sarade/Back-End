package com.jspriders.multithreading.main;

import com.jspriders.multithreading.thread.MyThread7;

public class ThreadMain6 {

	public static void main(String[] args) {
		MyThread7 myThread7 = new MyThread7();
		myThread7.setName("5");
		myThread7.start();
	}
}
