package com.yash.oops.problem11;

import java.util.Date;

public class Test
{

	public static void main(String[] args) 
	{
		Date dob = new Date(1991,10, 9);
		Date doj = new Date(2022, 07, 12);
         Employee e = new Employee(101,"dinesh","pune", 10000, dob, doj);
         System.out.println(e);
         
         
	}

}
