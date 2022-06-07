package oops;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		
		
			
			Student std = new Student();
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("ENTER ID");
			
			int id = sc.nextInt();
			
			System.out.println("ENTER NAME");
			
			String name = sc.next();
			
			System.out.println("ENTER EMAIL");
			
			String email = sc.next();
			
			System.out.println("ENTER COLLEGE");
			
			String clg = sc.next();
			
			std.setId(id);
			std.setName(name);
			std.setCity(email);
			
			
			System.out.println(std.getId()+" "+std.getName()+" "+std.getCity());
		}

	

	}


