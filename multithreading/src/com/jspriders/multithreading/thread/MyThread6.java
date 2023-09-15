package com.jspriders.multithreading.thread;

public class MyThread6 extends Thread{

	@Override
	public void run() {
		System.out.println("MyThread 6 is now running.");
		System.out.println("Name of Thread : " + Thread.currentThread().getName());
		System.out.println("Priority of Thread : " + Thread.currentThread().getPriority());
	}
}
