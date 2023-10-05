package com.kodnest.array.level2;

public class PrintArray {
	
	public static void PrintArray(int[] arr) {
		System.out.println();
		System.out.println("Forward direction Array ");
		System.out.print("Arr --> ");
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println();
		System.out.println("Reverse direction Array ");
		System.out.print("Arr --> ");
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.print(arr[i]+" ");
		}
		
	}

}
