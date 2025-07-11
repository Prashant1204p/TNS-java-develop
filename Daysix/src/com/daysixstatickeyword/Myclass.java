package com.daysixstatickeyword;

public class Myclass 
{
	private int section;
	private static int srNo;
	
	static{										//This Will Invoke when object is created
		System.out.println("Static Block");
	}
	
	void data() 							//Non Static Method
	{
		System.out.println("Non-Static Method");
		System.out.println(section);
		System.out.println(srNo);
	}
	
	static void display() 		//Static Method
	{
		System.out.println("Static Method");
		System.out.println(srNo);
	}
	public static void main(String[] args) 
	{	
//		display();
		Myclass my = new Myclass();
		my.data();
		display();

	}
}
