package com.daytwoconditionalandloopingstatements;

public class Assignment3 {
	public static void main(String[] args)
	{
		int number=18;
		if (number<=1)
		{
			System.out.println("number is not prime");
		}
		for(int i=2;i*i<=number;i++)
		{
			if(number%i==0)
			{
				System.out.println("number is prime");
				
			}
			else
			{
				System.out.print("number is not prime");
			}
		}
	}
}
