package com.kodnest.array.level2;

import java.util.Scanner;

public class BubbleSortMain {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Array Length");
		int arr[]=new int[scan.nextInt()];
		System.out.println("Enter "+arr.length+" Elements");
		for(int i=0;i<=arr.length-1;i++)
		{
		arr[i]=scan.nextInt();
		}
		System.out.println("Array Elements Before Sorting..");
		for(int i=0;i<=arr.length-1;i++)
		{
		System.out.print(arr[i]+" ");
		}
		BubbleSort sort = new BubbleSort();
		sort.bubbleSort(arr);
		System.out.println();
		System.out.println("Array Elements After Sorting..");
		for(int i=0;i<=arr.length-1;i++)
		{
		System.out.print(arr[i]+" ");
		}
		scan.close();
	}
	
}


