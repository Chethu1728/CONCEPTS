package com.kodnest.array.level2;

import java.util.Scanner;

public class RotationOfArray {
	public static void main(String[] args) 
	{
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter Array Length");
	int arr[]=new int[scan.nextInt()];
	System.out.println("Enter "+arr.length+" Elements");
	for(int i=0;i<=arr.length-1;i++)
	{
	arr[i]=scan.nextInt();
	}
	System.out.println("Enter the number of rotations");
	int r=scan.nextInt();
	System.out.println("Array elements before rotating");
	System.out.print("arr----->");
	for(int i=0;i<=arr.length-1;i++)
	{
	System.out.print(arr[i]+" ");
	}
	System.out.println();
	Rotation.clockwiseRotate(arr, r);
	System.out.println("Array elements after rotating");
	System.out.print("arr----->");
	for(int i=0;i<=arr.length-1;i++)
	{
	System.out.print(arr[i]+" ");
	}
	scan.close();
  }
}
