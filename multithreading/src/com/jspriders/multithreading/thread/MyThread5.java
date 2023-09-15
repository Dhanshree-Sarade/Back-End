package com.jspriders.multithreading.thread;

public class MyThread5 extends Thread{

		@Override
		public void run() {
			System.out.println("MyThread5 is now running...!!!");
			System.out.println("Thread Name : " + getName());
			System.out.println("Thread Priority : " + this.getPriority());
		}
}
