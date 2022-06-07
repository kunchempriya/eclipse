package com.cls;

import java.util.Iterator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;



public class Ex1 {

	public static void main(String[] args) {
Map<String, Integer> data = new HashMap<>();
		
		data.put("lenovo", 234);
		data.put("sony", 435);
		data.put("apple", 333);
		data.put("asus", 223);
		data.put("dell", 345);
		data.put("sony", 456);
		data.put("mac", 234);
		
		
		System.out.println(data);
		
		Map<String, Integer> dat = new LinkedHashMap<>();
		
		dat.put("lenovo", 234);
		dat.put("sony", 435);
		dat.put("apple", 333);
		dat.put("asus", 223);
		dat.put("dell", 345);
		dat.put("sony", 456);
		dat.put("mac", 234);
		
		
		System.out.println(dat);
		
		Iterator<Entry<String, Integer>> itr = data.entrySet().iterator();
		
		while(itr.hasNext())
		{
			Entry<String, Integer> et = itr.next();
			
			System.out.println(et.getKey()+" "+et.getValue());
		}
		
		System.out.println(data.get("mac"));
		
		for(String k : data.keySet())
		{
			System.out.println(k+" "+data.get(k));
		}
		
		for(Integer vl : data.values())
		{
			System.out.println(vl);
		}
	}




	}


