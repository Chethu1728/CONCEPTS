package com.kodnest.array.level2;

import java.util.Scanner;

public class PrintArrayMain {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the lengtn of array");
		int []arr=new int[scan.nextInt()];
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println("Enter the "+i+" array element");
			arr[i]=scan.nextInt();
		}
		PrintArray.PrintArray(arr);
		scan.close();
	}

}
