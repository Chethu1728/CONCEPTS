package com.kodnest.array.level2;

import java.util.Scanner;

public class InsertionSorting {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the array length");
		int []arr=new int[scan.nextInt()];
		System.out.println("Enter the array elements");
		for(int i=0;i<arr.length;i++) {
			arr[i]=scan.nextInt();
		}
		System.out.println("Array before sorting");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.err.println("---------------------------");
		new Insert().insertSort(arr);
		//Insert ar=new Insert();
		//ar.insertSort(arr);
		System.out.println("Array after sorting");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		scan.close();
	}

}
