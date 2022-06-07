package com.cls;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Exp7 {

	public static void main(String[] args) {
Map<Employee, Integer> data = new HashMap<Employee, Integer>();
		
		/*data.put(new Employee(1, "King", "Blr"), 234);
		
		data.put("lenovo", 474);
		data.put("asus", 123);
		data.put("dell", 256);
		data.put("sony", 567);
		data.put("apple", 456);
		data.put("mac", 647);
		
		System.out.println(data);
		*/
		
		LinkedHashMap<String, Integer> dat = new LinkedHashMap<>();
		
		dat.put("sony", 234);
		dat.put("lenovo", 474);
		dat.put("asus", 123);
		dat.put("dell", 256);
		dat.put("sony", 567);
		dat.put("apple", 456);
		dat.put("mac", 647);
		
		System.out.println(dat);
		
		Iterator<Entry<String, Integer>> itr = dat.entrySet().iterator();
		
		while(itr.hasNext())
		{
			Entry<String, Integer> et = itr.next();
			
			System.out.println(et.getKey()+" "+et.getValue());
		}
		
		for(String ky : dat.keySet())
		{
			System.out.println("Key : "+ky+" Value : "+dat.get(ky));
		}
		
		for(Integer val : dat.values())
		{
			System.out.println(val);
		}
	}
	}


