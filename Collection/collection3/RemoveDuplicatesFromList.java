package com.yash.collection3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesFromList {

	public static void main(String[] args) {

		ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(10, 11, 3, 4, 10, 11));
		System.out.println("ArrayList with duplicate elements: " + numbers);

		Set<Integer> set = new LinkedHashSet<>();
		set.addAll(numbers);

		numbers.clear();

		numbers.addAll(set);
		System.out.println("ArrayList without duplicate elements: " + numbers);
	}
}
