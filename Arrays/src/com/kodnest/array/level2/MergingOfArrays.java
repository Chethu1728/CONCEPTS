package com.kodnest.array.level2;

import java.util.Scanner;

public class MergingOfArrays {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the 1st array length");
		int []arr1=new int[scan.nextInt()];
		System.out.println("Enter the 1st array elements");
		for(int i=0;i<=arr1.length-1;i++)
		{
			arr1[i]=scan.nextInt();
		}
		System.out.println("Enter the 2nd array length");
		int []arr2=new int[scan.nextInt()];
		System.out.println("Enter the 2nd array elements");
		for(int i=0;i<=arr2.length-1;i++)
		{
			arr2[i]=scan.nextInt();
		}
		int []arr3=new int[arr1.length+arr2.length];
		for(int i=0;i<=arr1.length-1;i++)
		{
			arr3[i]=arr1[i];
		}
		int j=0;
		for(int i=arr1.length;i<=arr3.length-1;i++)
		{
			arr3[i]=arr2[j];
			j++;
		}
		for(int i=0;i<=arr3.length-1;i++)
		{
			System.out.print(arr3[i]+" ");
		}
		scan.close();
	}

}
