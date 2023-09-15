package com.jspriders.multithreading.main;

import com.jspriders.multithreading.thread.MyThread5;

public class ThreadMain4 {

	public static void main(String[] args) {
		MyThread5 myThread5 = new MyThread5();
		System.out.println("Name of Thread (By Default name) : " + myThread5.getName());
		System.out.println("Priority of Thread (By Default priority) : " + myThread5.getPriority());
		myThread5.setName("Thread 3");
		myThread5.setPriority(7);
		myThread5.start();
	}
}
