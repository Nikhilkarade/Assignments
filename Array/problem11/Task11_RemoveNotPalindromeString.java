package com.yash.array.problem11;

public class Task11_RemoveNotPalindromeString 
{
	
	
		static String str[]= {"nayan","abc","retret"};
		
		public static void main(String[] args) {
			Task11_RemoveNotPalindromeString t= new Task11_RemoveNotPalindromeString();
			
			for(String st:str)
			{
				t.checkPalindrom(st);
				
			}
		}
		public void checkPalindrom(String s)
		{
			char chArr[]=s.toCharArray();
			
			int n =chArr.length;
			int count=0;
			for(int i=0,j=chArr.length-1;i<chArr.length;i++,j--)
			{
				
				
				if(chArr[i]==chArr[j])
				{
					count++;
				}
				
			}
			if(count==n)
			{
				System.out.println("palindrom: "+s);
			}
		}

	}


