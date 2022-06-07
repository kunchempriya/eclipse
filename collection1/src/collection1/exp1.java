package collection1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class exp1 {

	public static void main(String[] args) {
		
		
		Set data = new HashSet();
		data.add("java");
		data.add(22);
		data.add(93.39);
		data.add("java");
		data.add(22);
		data.add('a');
		data.add(33.33f);
		System.out.println(data);
		Set dat = new LinkedHashSet();
		dat.add("java");
		dat.add(22);
		dat.add(93.39);
		dat.add("java");
		dat.add(22);
		dat.add('a');
		dat.add(33.33f);
		System.out.println(dat);
		Iterator itr = dat.iterator();
		while(itr.hasNext())
		{
		System.out.println(itr.next());
		}
		}
		}

	
		