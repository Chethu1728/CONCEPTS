package com.kodnest.array.level2;

import java.util.Scanner;

public class SumOfTwoArrays {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the length of arrays");
		int arr1[]=new int[scan.nextInt()];
		System.out.println("Enter the 1st array elements ");
		for(int i=0;i<=arr1.length-1;i++)
		{
			arr1[i]=scan.nextInt();
		}
		int arr2[]=new int[arr1.length];
		System.out.println("Enter the 2nd array elements ");
		for(int i=0;i<=arr2.length-1;i++)
		{
			arr2[i]=scan.nextInt();
		}
		int []arr3=new int[(arr1.length)];
		for(int i=0;i<=arr3.length-1;i++)
		{
			arr3[i]=arr1[i]+arr2[i];
		}
		System.out.println("3rd Array elements are: ");
		for(int i=0;i<=arr3.length-1;i++)
		{
			System.out.print(arr3[i]+" ");
		}
		scan.close();
	}

}
