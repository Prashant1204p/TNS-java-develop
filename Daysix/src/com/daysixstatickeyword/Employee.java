package com.daysixstatickeyword;

public class Employee {
	int empid;
	String name;
	static String companyname="TNS";

	public Employee(int empid, String name) {
		super();
		this.empid = empid;
		this.name = name;
	}
	
	public void EmpData() 
	{
		System.out.println("EmpId:"+empid+" EMP NAME:"+name+" CompanyNAme:"+companyname);
	}

}
