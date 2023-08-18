package com.kodnest.methods.methodProblems;

import java.util.Scanner;

public class Problem1 {

	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
		String name=scan.nextLine();
		greet(name);
	}
	public static void greet(String x)
			{
		System.out.println("Hello  "+x+" "+"How are you,,,");
			}
}