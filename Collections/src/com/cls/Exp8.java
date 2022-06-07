package com.cls;

import java.util.TreeMap;

public class Exp8 {

	public static void main(String[] args) {
		TreeMap<String, Integer> data = new TreeMap<>();
		
		data.put("sony", 234);
		data.put("lenovo", 474);
		data.put("asus", 123);
		data.put("dell", 256);
		data.put("sony", 567);
		data.put("apple", 456);
		data.put("mac", 647);
		
		System.out.println(data);
		
		
	}

}


