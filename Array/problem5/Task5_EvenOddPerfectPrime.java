package com.yash.array.problem5;

public class Task5_EvenOddPerfectPrime
{
	
	
		public static void main(String[] args) {
			int[] a = { 4, 6, 8, 10, 13, 15, 19, 21, 27 };
			int count = 0;
			int count1 = 0;
			int count2 = 0;
			int p = 0;
			for (int i = 0; i < a.length; i++) {
				if (a[i] % 2 == 0) {
					count++;
				}
				if (a[i] % 2 != 0) {
					count1++;
				}
				int prime = 1;
				for (int j = 2; j <= a.length - 1; j++) {
					if (a[i] % j == 0) {
						prime++;
					}
				}
				if (prime == 1) {
					count2++;
				}
				int sum = 0;
				int t = a[i];
				for (int k = 1; k < t; k++) {
					if (t % k == 0) {
						sum = sum + k;
					}
				}
				if (sum == t) {
					p++;
				}
			}
			System.out.println("even no :-" + count);
			System.out.println("odd no :-" + count1);
			System.out.println("prime no :-" + count2);
			System.out.println("perfect no :-" + p);
		}

	}

