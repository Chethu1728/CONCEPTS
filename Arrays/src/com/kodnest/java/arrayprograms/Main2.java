package com.kodnest.java.arrayprograms;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String arr[]=new String[8];
		System.out.println("Enter the name of  the employee");
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=scan.nextLine();
		}
		System.out.println("The names of the  employees are");
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println(arr[i]);
		}
		scan.close();
	}

}
