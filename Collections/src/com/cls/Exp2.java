package com.cls;

import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class Exp2 {

	public static void main(String[] args) {
		TreeMap<String, Integer> data = new TreeMap<String, Integer>();
		
		data.put("lenovo", 234);
		data.put("sony", 435);
		data.put("apple", 333);
		data.put("asus", 223);
		data.put("dell", 345);
		data.put("sony", 456);
		data.put("mac", 234);
		
		
		System.out.println(data);
		
		Map<String, Integer> str = data.entrySet().stream().filter(data1 -> data1.getValue().intValue() > 300)
				.collect(Collectors.toMap(data2 -> data2.getKey(), data2 -> data2.getValue()));
		
		System.out.println(str);
		
		data.forEach((k,v) -> System.out.println("Key : "+k+" Value "+v));
		
		str.forEach((x,y) -> System.out.println(x+" "+y));
	}

	}


