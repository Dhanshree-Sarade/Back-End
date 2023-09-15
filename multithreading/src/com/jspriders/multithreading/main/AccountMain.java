package com.jspriders.multithreading.main;

import com.jspiders.multithreading.resource.Account;
import com.jspriders.multithreading.thread.Husband;
import com.jspriders.multithreading.thread.Wife;

public class AccountMain {

	public static void main(String[] args) {
		Account account = new Account(10000);
		Husband husband = new Husband(account);
		Wife wife = new Wife(account);
		husband.start();
		wife.start();
	}
}
