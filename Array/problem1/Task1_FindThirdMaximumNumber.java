package com.yash.array.problem1;

public class Task1_FindThirdMaximumNumber 
{
	public static void main(String[] args) {
		int arr[]= {1,2,45,33,50,65,55};
		int size= arr.length;
		int temp;
		for(int i=0;i<size;i++)
		{
			for(int j=i+1;j<size;j++)
			{
				if(arr[i]>arr[j])
				{
					temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("Third largest number: "+arr[size-3]);
	}
}
