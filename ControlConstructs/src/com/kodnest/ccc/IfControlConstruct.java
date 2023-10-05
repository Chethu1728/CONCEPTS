package com.kodnest.ccc;

import java.util.Scanner;

public class IfControlConstruct {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the marks");
		int marks=scan.nextInt();
		System.out.println("WELCOME TO KODNEST");
		if(marks>=80) {
			System.out.println("WELCOME TO TECH CLUB");
		}
		scan.close();
	}

}
