package com.yash.array.problem2;

public class Task2_DuplicateNumber
{
	//WAP to find duplicate numbers and there counting from list of numbers.
	
		public static void main(String[] args) {
			int a[] = { 5,6,7,2,3,4,5,6,7};

			int sum = 0;
			System.out.print("Duplicate Number are: ");
			for (int i = 0; i < a.length; i++) {
				int count = 0;
				for (int j = i + 1; j < a.length; j++) {

					if (a[i] == a[j]) {
						count++;
						sum = sum + count;
						System.out.print(a[i] + " ");
					}

				}

			}
			System.out.println();

			System.out.println("Total Count: " + sum);
		}

	}


