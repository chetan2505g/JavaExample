package com.chetan.threadEx;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=20;
		
		for (int i=1;i<=n ;i++) {
		Thread t1 = new Thread1();
		t1.start();
		
		Thread t2 =new Thread(new Thread2());
		t2.start();
		}
	}
}
