 package com.kodnest.array.level2;

import java.util.Scanner;

public class LinearSearch {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the array length");
		int arr[]=new int[scan.nextInt()];
		System.out.println("enter the array elements");
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=scan.nextInt();
		}
		boolean flag=false;
		System.out.println("Enter the key to search");
		int key=scan.nextInt();
		for(int i=0;i<=arr.length-1;i++)
		{
			if(arr[i]==key)
			{
				System.out.println("Key found at index "+i);
				flag=true;
				break;
			}
		}
		if(flag==false)
			System.out.println("Key not found......");
		scan.close();
	}
	

}
