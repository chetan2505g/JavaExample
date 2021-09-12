package com.chetan.currentHashMap;


import java.util.concurrent.*;
import java.util.Iterator;
import java.util.Set;

public class CHSMultiThreading  extends Thread{

	static ConcurrentHashMap<Number,String> m =new ConcurrentHashMap<Number,String>();
	public void run() {
		try {
			Thread.sleep(2000);
		}catch(InterruptedException e) { }
		System.out.print("Adding child thread");
		m.put(103,"C");
	}
	
	public static void main(String[] args) throws InterruptedException
	{
		m.put(101,"A");
		m.put(102,"B");
		
		CHSMultiThreading t =new CHSMultiThreading();
		t.start();
		
		Set s1 = m.keySet();
		@SuppressWarnings("rawtypes")
		Iterator itr =s1.iterator();
		while (itr.hasNext()) {
			Integer I =(Integer) itr.next();
			System.out.println("Main thread iterating list object" + I + " Value: " + m.get(I));
			Thread.sleep(3000);
		}
		System.out.println("Success: " + m);
	}
	
}
