package com.yash.exception.problem3;

import java.util.Scanner;

public class TryWithResources {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value");
		int b=sc.nextInt();
		try
		{
		 System.out.println("try start");
		 
		 int a= b/0;
		 
		 System.out.println(a);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("catch block");
		}
		finally
		{
			System.out.println("finally block");
		}
		
		
	}

}
