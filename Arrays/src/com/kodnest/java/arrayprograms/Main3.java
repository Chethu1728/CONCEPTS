package com.kodnest.java.arrayprograms;

import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		double arr[]=new double[10];
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println("Enter the height of the  player "+i);
			arr[i]=scan.nextDouble();
		}
		System.out.println("The height of the players is");
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.print(arr[i]+" ft | ");
		}
		scan.close();
	}

}
