package com.chetan.currentHashMap;

import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;

public class MyThread  extends Thread{

	static ArrayList<String> l =new ArrayList<String>();
	public void run() {
		try {
			Thread.sleep(2000);
		}catch(InterruptedException e) { }
		System.out.print("Adding child thread");
		l.add("D");
	}
	
	public static void main(String[] args) throws InterruptedException
	{
		l.add("A");
		l.add("B");
		l.add("C");
		
		MyThread t =new MyThread();
		t.start();
		
		Iterator<String> itr =l.iterator();
		while (itr.hasNext()) {
			String s1 =(String) itr.next();
			System.out.println("Main thread iterating list object" + s1);
			Thread.sleep(3000);
		}
		System.out.println(l);
//		for(String key : l ) {
//			System.out.println("Thread display" +key);
//		}
			
	
		
	}
	
}
