package com.chetan.synchronization;

public class Thread2 implements Runnable {
	MathUtils mu;

	public MathUtils getMu() {
		return mu;
	}

	public void setMu(MathUtils mu) {
		this.mu = mu;
	}

	public Thread2(MathUtils mu) {
		// TODO Auto-generated constructor stub
		this.mu = mu;
	}

	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Thread2 is running");
		mu.getMultiples(3);
	}
}
