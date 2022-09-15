package com.yash.StringAssignments;

import java.util.GregorianCalendar;

public class String5 {
	public static void main(String[] args) {
		System.gc();
		long start=new GregorianCalendar().getTimeInMillis();
		System.out.println(start);
		long startMemory=Runtime.getRuntime().freeMemory();
		StringBuffer sb = new StringBuffer();
				for(int i = 0; i<10000000; i++){
			sb.append(":").append(i);
		}
		
		long end=new GregorianCalendar().getTimeInMillis();
		System.out.println(end);
		long endMemory=Runtime.getRuntime().freeMemory();
		System.out.println("required time:"+(end-start));
		System.out.println("Memory used:"+(startMemory-endMemory));
	}

}
