package com.yash.StringAssignments;


public class String7 {
	public void finalize() {
		System.out.println("Garbage collected");
	}

	public static void main(String[] args) {

		String7 s1 = new String7();
		String7 s2 = new String7();
		s1=s2;
		System.gc();

	}

}
