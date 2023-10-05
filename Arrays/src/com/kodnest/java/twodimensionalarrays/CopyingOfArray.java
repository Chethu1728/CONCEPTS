package com.kodnest.java.twodimensionalarrays;

import java.util.Scanner;

public class CopyingOfArray {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the array lengths ");
		int [][]arr1=new int[scan.nextInt()][scan.nextInt()];
		System.out.println("enter the array elements");
		for(int i=0;i<=arr1.length-1;i++)
		{
			for(int j=0;j<=arr1[i].length-1;j++)
			{
				arr1[i][j]=scan.nextInt();
			}
		}
		int [][]arr2=new int[arr1.length][];
		for(int i=0;i<=arr1.length-1;i++)
		{
				arr2[i]=new int[arr1[i].length];
		}
		for(int i=0;i<=arr2.length-1;i++)
		{
			for(int j=0;j<=arr2[i].length-1;j++)
			{
				arr2[i][j]=arr1[i][j];
			}
		}
		
		System.out.println("Elements of array 1 are,,,,,,,");
		for(int i=0;i<=arr1.length-1;i++)
		{
			for(int j=0;j<=arr1[i].length-1;j++)
			{
				System.out.print(arr1[i][j]+" | ");
			}
			System.out.println();
		}
		System.out.println("Elements of array 2 are,,,,,,,");
		for(int i=0;i<=arr1.length-1;i++)
		{
			for(int j=0;j<=arr1[i].length-1;j++)
			{
				System.out.print(arr2[i][j]+" | ");
			}
			System.out.println();
		}
		scan.close();
	}

}
