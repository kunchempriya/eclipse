package com.cls;

import java.util.Iterator;
import java.util.TreeSet;

public class Exp6 {

	public static void main(String[] args) {
TreeSet<Integer> data = new TreeSet<>();
		
		data.add(15);
		data.add(4);
		data.add(9);
		data.add(5);
		data.add(3);
		data.add(2);
		data.add(13);
		data.add(11);
		
		System.out.println(data);
		
		TreeSet<String> names = new TreeSet<String>();
		
		names.add("lenovo");
		names.add("dell");
		names.add("sony");
		names.add("asus");
		names.add("apple");
		names.add("imac");
		
		System.out.println(names);
		
		Iterator<Integer> itrIterator = data.descendingIterator();
		
		
	}
	}


