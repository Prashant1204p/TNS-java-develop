package com.daytwoconditionalandloopingstatements;

public class Switchcases {
	public static void main(String[] args)
	{
		char x='w';
		switch(x)
		{
		  case'l':
			  System.out.println("this code contains letters");
			  break;
		  case 'd':
			  System.out.println("this code contains digits");
			  break;
		  case's':
			  System.out.println("this code contains symbols");
			  break;
		  case'w':
			  System.out.println("this code contains whitespaces");
			  break;
		  default:
			  System.out.println("this code does not contain letters symbols and whitespaces digits also");
			  break;
			  
		}
	}
}

