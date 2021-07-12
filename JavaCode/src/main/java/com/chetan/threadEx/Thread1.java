package com.chetan.threadEx;

 class Thread1 extends Thread{
@Override
	public void run() {
		System.out.println("Thread 1 is running");

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
