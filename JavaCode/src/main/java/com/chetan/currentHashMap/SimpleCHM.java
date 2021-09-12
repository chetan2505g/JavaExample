package com.chetan.currentHashMap;

import java.util.concurrent.*;

public class SimpleCHM {
	public static void main (String[] args) {
		ConcurrentHashMap<Integer, String> m = new ConcurrentHashMap<Integer, String>();
		
		m.put(101, "A");
		m.put(102,"B");
		m.putIfAbsent(103,"C");
		m.putIfAbsent(101, "D");
		m.remove(102,"C");
		m.replace(102, "B","Changed");
		
		System.out.println("NEW CHS: " + m);
	}

}
