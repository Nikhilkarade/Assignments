package com.yash.array.problem6;

public class Task6__AssendingDescendingofArray
{
  public static void main(String[] args)
  {
	int[]arr= {10,25,15,17,20,25,30,27,40,35};
	int temp=0;
	int flag=0;
	for(int i=arr.length/2;i>=1;i--)
	{
		for(int j=i-1;j>=0;j--)
		{
			if(arr[i]<arr[j])
			{
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
			
		}
	}
	for(int i=arr.length/2+1;i<arr.length-1;i++)
	{
		for(int j=i+1;j<arr.length;j++)
		{
			if(arr[i]<arr[j])
			{
				flag=arr[i];
				arr[i]=arr[j];
				arr[j]=flag;
			}
		}
	}
	for(int k=0;k<arr.length;k++)
	{
		System.out.println(arr[k]);
	}
  }
}
