package com.chetan.synchronization;

class Thread1 extends Thread {
	MathUtils mu;

	public Thread1(MathUtils mu) {
		// TODO Auto-generated constructor stub
		this.mu = mu;
	}

	@Override
	public void run() {
		System.out.println("Thread 1 is running");
		mu.getMultiples(2);
	}

	public MathUtils getMu() {
		return mu;
	}

	public void setMu(MathUtils mu) {
		this.mu = mu;
	}
}
