package packege4;
import java.util.Scanner;

import packege3.Sbi;
public class Test {
public static void main(String[] args) {
	
	Scanner s1= new Scanner(System.in);
	 Sbi s2= new Sbi();
	// System.out.println("Enter how many persons account you want to create:");
	         // int x1   = s1.nextInt();
	        //  int x2[]=new int[x1];
	       //   for(int i1 =1; i1<=x2.length; i1++)
	       //   {
	        	  
	          
	          
	 while(true)
	 { 
		 System.out.println("******************************************");
		 System.out.println("Enter 1 for account creation:");
		 System.out.println("Enter 2 for your acc details:");
		 System.out.println("Enter 3 for deposite money:");
		 System.out.println("Enter 4 for withdrwal money:");
		 System.out.println("Enter 5 for check balance:");
		 System.out.println("Enter 6 for exit:");
		 System.out.println("******************************************");
		 System.out.print("Enter your choice:");
		
		  int i= s1.nextInt();
		 switch(i)
		 {
		 case 1 : s2.creatAccount();
		         break;
		 case 2: s2.displayAllDetails();
		      break;
		 case 3: s2.depositeMoney();
		        break;
		 case 4: s2.withdrawalMoney();
		       break;
		 case 5: s2.balanceCheck();
		      break;
		 case 6 :System.exit(i);
		   break;
		 default: System.out.println("Invalid choice");
		 }
		  
		
	 }
		 
}

}
  // }