package com.daythreescannerandconstructor;

import java.util.Scanner;

public class Input {
	public Input(int a)
	{
		System.out.println(a);
		
	}
	
	public static void main(String[] args)
	{
		Scanner sobj1=new Scanner(System.in);
		int value1=sobj1.nextInt();
		Input obj1=new Input(value1);
		
	}

}
