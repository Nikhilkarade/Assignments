package com.yash.collection1;

import java.util.*;

public class SortingAscendingOrder {

	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<String>();
		al.add(".net");
		al.add("Java");
		al.add("python");
		al.add("Angular");
		al.add("html");

		Collections.sort(al);

		System.out.println("List After Sorting :- " + "\n" + al);
	}
}
