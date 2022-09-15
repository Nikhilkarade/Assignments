package packege3;

import Packege2.Rbi;
import java.util.Scanner;

import Packege1.Account;
public class Sbi implements Rbi{
    Account a1= new Account();
      Scanner s = new Scanner(System.in);
        
      
	@Override
	public void creatAccount() {
		System.out.print("Set your pin:");
        String z=s.next();
          a1.setPin(z);
          while(true)
          {
        	  while(true)
        	  {
        		  System.out.print("Enter your first name:");
                  
        	   	    String t2 =     s.next();
        	   	 boolean result=t2.matches("[a-zA-Z]+");
        		  if(result==true)
        		  {
        			  a1.setName1(t2);
        			  break;
        		  }
        		  else
        		  {
        			  System.out.println("Please Enter Your Name in Alphabet only"); 
        		  }
        	  }
        	  
        		  while(true)
            	  {
            		  System.out.print("Enter your last name:");
                      
            	   	    String t =     s.next();
            	   	 boolean result1=t.matches("[a-zA-Z]+");
            		  if(result1==true)
            		  {
            			  a1.setName2(t);
            			  break;
            		  }
            		  else
            		  {
            			  System.out.println("Please Enter Your Name in Alphabet only"); 
            		  }
            	  }
        		  String s1=a1.getName1() +" "+a1.getName2();
        		  if(true)
        		  {
        			  a1.setName3(s1);
        			  break;
        		  }
        		  
        	  }
        	  
        	  
        while(true)
		  {
		System.out.print("Enter your 13 digit account number:");
		       String t1   = s.next();
		       
		      
		       if(t1.length()==13)
		       {
		    	   a1.setAccoNo(t1);
		    	   break;
		       }
		       else
		       {
		    	   System.out.println("Please enter correct account number:"); 
		       }
		  }  
		  while(true)
		  {
		   
	   System.out.print("Enter your correct 10 digit mob number:");
	       String t3= s.next(); 
	      
	       
	       if(t3.length()==10)
	       { 
	    	   a1.setMobNo(t3);
	    	   break;
	       }
	       else
	       {
	    	   System.out.println("Invalid mobile number..."); 
	    	   
	       }
	   }
	       while(true)
	       {
	        System.out.print("Enter your 12 digit  Adhar number:"); 
	              String t4= s.next();
	              if(t4.length()==12)
	              {
	              a1.setAdharNo(t4);
	                break;
	              }
	              else
	              {
	            	  System.out.println("Invalid aadhar number...");
	              }
	       }
	       while(true)
	       {
	       System.out.print("Enter your gender in lower case:");
	              String t5= s.next();
	            String  t6="male"; String t7="female";
	          if(t5.equals(t6))
	          { 
	              a1.setGender(t5);
	              break;
	          }
	          else if(t5.equals(t7))
	          {
	        	  a1.setGender(t5);
	              break; 
	          }
	          else
	          {
	        	  System.out.println("Please Enter in lower case:");
	          }
	       }
	        
	       while(true)
	       {
	    	  
	       
	       System.out.print("Enter your age:");
	                int t6= s.nextInt();
	         if(t6>=18)
	         {
	                      a1.setAge(t6);
	                      break;
	         }
	         else
	         {
	        	 System.out.println("Invalid age");
	         }
	       }
	       while(true)
	       {
	    	   System.out.print("Please deposite  minimum 500 or more starting amount:");
	    	   double d1=s.nextDouble();
	    	   if(d1>=500.0)
	    	   {
	    		   a1.setBalance(d1);
	    		   break;
	    	   }
	    	   else
	    	   {
	    		   
	    		   System.out.println("Enter minimum 500 amount....");
	    	   }
	    	   
	           
	       }
	       System.out.println("Congratualation ..your Account created successfully");
	}

	

	@Override
	public void displayAllDetails() {
		
		while(true)
		{
		System.out.println("Please enter your set password:");
		        String z1     = s.next();
		        if(z1.equalsIgnoreCase(a1.getPin())==true)
		        {
		
		System.out.println(" Account No :"+a1.getAccoNo());
		System.out.println("Name :"+a1.getName3());
		System.out.println("Mobile No :"+a1.getMobNo());
		System.out.println("Adhar No:"+a1.getAdharNo());
		System.out.println("Gender:"+a1.getGender());
		System.out.println("Age:"+a1.getAge());
		System.out.println("Balance:"+a1.getBalance());
		            break;
		        }
		        
		        else
		        {
		        	System.out.println("Please Enter correct set password");	
		        }
		}	
	}

	@Override
	public void depositeMoney() {
		while(true)
		{
		System.out.println("Please enter your set password:");
		        String z1     = s.next();
		        if(z1.equalsIgnoreCase(a1.getPin())==true)
		        {
		System.out.println("Enter deposite money");
		double d	=s.nextDouble();
		double total= d+ a1.getBalance();
		  a1.setBalance(total);
		     System.out.println("Your Balance Amount:"+a1.getBalance());
		         break;
		        }
		        else
		        {
		        	System.out.println("Please Enter correct set password");
		        }
	}
	}
	@Override
	public void withdrawalMoney() {
		while(true)
		{
		System.out.println("Please enter your set password:");
        String z1     = s.next();
        
        if(z1.equalsIgnoreCase(a1.getPin())==true)
        {
		
		System.out.println("Enter withdrawal money");
		double d	=s.nextDouble();
		double total=  (a1.getBalance() - d);
		  a1.setBalance(total);
		     System.out.println("Your Balance Amount:"+a1.getBalance());
		     break;
        }
        else
        {
        	System.out.println("Please Enter correct set password");
        }
        
	}
	}
	@Override
	public void balanceCheck() {
		// TODO Auto-generated method stub
		 System.out.println("Your Balance Amount:"+a1.getBalance());	
	}
	

}
