package com.chetan.synchronization;

public class ThreadSynchronizDemo {
	public static void main(String[] args) {

		MathUtils obj = new MathUtils();

		Thread t1 = new Thread1(obj);
		t1.start();

		Thread t2 = new Thread(new Thread2(obj));
		t2.start();

	}
}
