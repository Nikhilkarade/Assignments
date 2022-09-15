package com.yash.oops.problem10;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {
	public static void main(String[] args) throws ParseException {
		Employee e = new Employee();
		e.setEmpid(1);
		e.setEmpname("Sagar");
		e.setEmpaddress("pune");
		e.setEmpsalary(25000);

		String dob="10/04/1994";
		Date dobb = new SimpleDateFormat("dd/MM/yyyy").parse(dob);
		e.setEmp_dob(dobb);
		
		String doj="9/08/2022";
		Date doj1 = new SimpleDateFormat("dd/MM/yyyy").parse(doj);
		e.setEmp_doj(doj1);
		System.out.println(e);
		
	}

}
