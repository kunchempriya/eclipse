package collection1;

import java.util.Set;
import java.util.TreeSet;

public class exp2 {

	public static void main(String[] args) {
		Set<String> data = new TreeSet<String>();
		data.add("java");
		data.add("hibernate");
		data.add("hello");
		data.add("java");
		data.add("spring");
		data.add("plm");
		System.out.println(data);
		Set<Integer> data1 = new TreeSet<Integer>();
		data1.add(11);
		data1.add(2);
		data1.add(22);
		data1.add(20);
		data1.add(11);
		data1.add(3);
		data1.add(7);
		data1.add(null);
		System.out.println(data1);
		}
		


	}


