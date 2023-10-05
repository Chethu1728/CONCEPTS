package com.kodnest.array.level2;

import java.util.Scanner;

public class SwapingOf2Index {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the length of an array:");
		int []arr=new int[scan.nextInt()];
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println("Enter the "+i+" array element");
			arr[i]=scan.nextInt();
		}
		System.out.println("Enter the indxes to be swapped from 0 to "+(arr.length-1));
		int a=scan.nextInt();
		int b=scan.nextInt();
		System.out.println("Before swapping");
		System.out.print("Arr --> ");
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		int c=0;
		c=arr[a];
		arr[a]=arr[b];
		arr[b]=c;
		System.out.println("After swapping");
		System.out.print("Arr --> ");
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.print(arr[i]+" ");
		}
		scan.close();
		
	}

}
