package com.kodnest.java.twodimensionalarrays;

import java.util.Scanner;

public class AddingOfTwoArrays 
{
	public static void main(String[] args) 
	{
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the 2D array1 lengths");
	int m=scan.nextInt();
	int n=scan.nextInt();
	int [][]arr1=new int[m][n];
	System.out.println("enter the array1 elements");
	for(int i=0;i<=arr1.length-1;i++)
	{
		for(int j=0;j<=arr1[i].length-1;j++)
		{
			arr1[i][j]=scan.nextInt();
		}
	}
	int [][]arr2=new int[m][n];
	System.out.println("enter the array2 elements");
	for(int i=0;i<=arr2.length-1;i++)
	{
		for(int j=0;j<=arr2[i].length-1;j++)
		{
			arr2[i][j]=scan.nextInt();
		}
	}
	int [][]arr3=new int[m][n];
	for(int i=0;i<=arr3.length-1;i++)
	{
		for(int j=0;j<=arr3[i].length-1;j++)
		{
			arr3[i][j]=arr1[i][j]+arr2[i][j];
		}
	}
	System.out.println("Array1 contents are ,,,,");
	for(int i=0;i<=arr1.length-1;i++)
	{
		for(int j=0;j<=arr1[i].length-1;j++)
		{
			System.out.print(arr1[i][j]+" ");
		}
		System.out.println();
	}
	System.out.println("------------------");
	System.out.println("Array2 contents are ,,,,");
	for(int i=0;i<=arr2.length-1;i++)
	{
		for(int j=0;j<=arr2[i].length-1;j++)
		{
			System.out.print(arr2[i][j]+" ");
		}
		System.out.println();
	}
	System.out.println("------------------");
	System.out.println("Array3 contents are ,,,,");
	for(int i=0;i<=arr3.length-1;i++)
	{
		for(int j=0;j<=arr3[i].length-1;j++)
		{
			System.out.print(arr3[i][j]+" ");
		}
		System.out.println();
	}
	scan.close();
	}
}