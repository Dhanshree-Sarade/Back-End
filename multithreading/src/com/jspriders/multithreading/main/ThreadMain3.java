package com.jspriders.multithreading.main;

import com.jspriders.multithreading.thread.MyThread3;
import com.jspriders.multithreading.thread.MyThread4;

public class ThreadMain3 {

	public static void main(String[] args) {
		MyThread3 myThread3 = new MyThread3();
		MyThread4 myThread4 = new MyThread4();
		Thread thread = new Thread(myThread4);
				myThread3.start();
				thread.start();
	}
}