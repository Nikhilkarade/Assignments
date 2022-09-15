package com.yash.exception.problem1;

import java.util.Scanner;

public class Check_Student_status {
	
	Scanner sc=new Scanner(System.in);
	
	StudentResult r;
	Student st;
	
	public void stuData()
	{
		r=new StudentResult();
		st=new Student();
		
		System.out.println("Enter Geography marks");
		r.setGeography(sc.nextDouble());
		
		System.out.println("Enter Histroy marks");
		r.setHistroy(sc.nextDouble());
		System.out.println("Enter math marks");
		r.setMath(sc.nextDouble());
		System.out.println("Enter Science marks");
		r.setScience(sc.nextDouble());
		
		System.out.println("Enter Student Name ");
		st.setSname(sc.next());
		System.out.println("Enter Student Address");
		st.setSaddress(sc.next());
		System.out.println("Enter Student Roll no");
		st.setRollno(sc.nextInt());
		
		st.setSr(r);
		
		
	}
	
	
	
	
	public void stuResult()throws Student_Fail
	{
		
		if(r.getGeography()<40||r.getHistroy()<40||r.getMath()<40||r.getScience()<40)
		{
			
			throw new Student_Fail("Student Fail Due to fail in  Subject");
		}
		else {
			System.out.println("You are pass");
		}
		
	}
	
	
	

	
	int count=1;
	public void checkMark()throws MoreThanOneSubjectException,MarkBelowZeroException
	{
		
		
		try {
		
		if(r.getGeography()<0 || r.getHistroy()<0 || r.getMath()<0 || r.getScience()<0)
		{
			
		throw new MarkBelowZeroException("marks is below 0");
		}
		}
		catch(MarkBelowZeroException ez)
		{
			System.out.println(ez.getMessage()+"please add the marks which not less than zero");
			stuData();
		}
		
		
			
		if(r.getGeography()<40)
		{
		count++;	
		}
		else if(r.getHistroy()<40)
		{
			count++;
		}
		else if(r.getMath()<40)
		{
			count++;
		}
		else if(r.getScience()<40)
		{
			count++;
		}
		else {
			System.out.println("Not fail in one or more");
		}
		
		
		
		try {
		
		if(count>1) 
		{
			throw new MoreThanOneSubjectException("Fail in more than one Subject");
			
		}
		}
		catch(MoreThanOneSubjectException eer)
		{
			System.out.println(eer.getMessage());
		}
					
	}
	
	
	double avg;
	public void stuPercentage()throws Below40Exception
	{
		
		double totalMarks=r.getGeography()+r.getHistroy()+r.getMath()+r.getScience();
		
		avg=totalMarks/4;
		
		
		try {
		
		if(avg<40)
		{
			throw new Below40Exception("total Avrage is "+avg+" 'Marks is Below 40'");
		}
		else {
			System.out.println("Student is pass");
		}
		}
		catch(Below40Exception eb)
		{
			System.out.println(eb.getMessage());
		}
		
		
		
	}
	
	
	
	public static void main(String[] args) {
		
		
		Check_Student_status ct;
		
//		try {
//			
//			ct=new Check_Student_status();
//			
//			ct.stuData();
//			ct.stuResult();
//			
//		} catch (Student_Fail e) {
//			// TODO: handle exception
//			
//			System.out.println(e.getMessage());
//		}
		
		
		try {
			
ct=new Check_Student_status();
			
			ct.stuData();
			ct.checkMark();
			ct.stuPercentage();
			
		} catch (MoreThanOneSubjectException ee) {
			
			
		}
		catch (Below40Exception eb) {
			// TODO: handle exception
			
		}
		catch (MarkBelowZeroException ezz) {
			// TODO: handle exception
			
		}
		
		
		
		
	}

}
