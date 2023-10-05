package com.kodnest.array.level2;

import java.util.Scanner;

public class DivisibleBy5 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the array length");
		int arr[]=new int[scan.nextInt()];
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=scan.nextInt();
		}
		System.out.println("Numbers divisible by 5 in the array is: ");
		for(int i=0;i<=arr.length-1;i++)
		{
			if(arr[i]%5==0)
			{
				System.out.print(arr[i]+" ");
			}
		}
		scan.close();
	}

}
