package com.kodnest.methods.methodProblems;
import java.util.Scanner;

public class Problem2 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter your name ");
		String name=scan.next();
		System.out.println("enter your year of birth");
		int birth=scan.nextInt();
		greet(name);
		int res=age(birth);
		System.out.println("the age of "+name+" is "+res);
		
	}
	public static void greet(String name)
	{
		System.out.println("Hello "+name+" How are you..");
	}
	public static int age(int a)
	{
		int b=2023;
		int c=b-a;
		return c;
	}
}
