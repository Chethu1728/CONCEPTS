package com.kodnest.java.arrayprograms;

import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number of students ");
		int a=scan.nextInt();
		int arr[]=new int[a];
		System.out.println("Enter the marks of "+a+" students");
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=scan.nextInt();
		}
		System.out.println("Marks of the "+a+" students is");
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println(arr[i]);
		}
		scan.close();
	}

}
