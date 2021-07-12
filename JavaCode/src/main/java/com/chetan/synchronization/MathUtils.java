package com.chetan.synchronization;

public class MathUtils {
	synchronized void getMultiples(int n) {
		for (int i = 1; i <= 5; i++) {
			System.out.println(n * i);
			try {
				Thread.sleep(400);
			} catch (InterruptedException e) {
					e.printStackTrace();
			}
		}
	}
}
