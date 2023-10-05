package com.kodnest.java.twodimensionalarrays;

import java.util.Scanner;

public class ArrayMultiplication {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the lengths of 2D array1");
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
		System.out.println("Enter the lengths of 2D array2");
		int a=scan.nextInt();
		int b=scan.nextInt();
		int [][]arr2=new int[a][b];
		System.out.println("enter the array2 elements");
		for(int i=0;i<=arr2.length-1;i++)
		{
			for(int j=0;j<=arr2[i].length-1;j++)
			{
				arr2[i][j]=scan.nextInt();
			}
		}
		int [][]arr3=new int[m][b];
		if(n != a)
		{
			System.out.println("Multiplication is not possible ");
		}
		else
		{
			for (int i = 0; i < m; i++) 
			{
                for (int j = 0; j < b; j++) 
                {
                    for (int k = 0; k < n; k++) 
                    {
                        arr3[i][j] += arr1[i][k]*arr2[k][j];
                    }
                }
            }
		}
		System.out.println("Array 1 Contents are....");
		for(int i=0;i<=arr1.length-1;i++)
		{
			for(int j=0;j<=arr1[i].length-1;j++)
			{
				System.out.print(arr1[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("Array 2 Contents are....");
		for(int i=0;i<=arr2.length-1;i++)
		{
			for(int j=0;j<=arr2[i].length-1;j++)
			{
				System.out.print(arr2[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("Array 3 Contents are....");
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
