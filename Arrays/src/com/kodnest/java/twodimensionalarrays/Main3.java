package com.kodnest.java.twodimensionalarrays;

import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		float [][]arr=new float[3][];
		arr[0]=new float[5];
		arr[1]=new float[3];
		arr[2]=new float[6];
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr[i].length-1;j++)
			{
				System.out.println("Enter wieght of the player "+j+" from team "+i);
				arr[i][j]=scan.nextFloat();
			}
		}
		System.out.println("               The weights of the players is,,,,");
		System.out.println("        Student1 | Student2 | student3 | Student4 | Student5 | Student6 |");
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.print("Class "+(i+1)+"-> ");
			for(int j=0;j<=arr[i].length-1;j++)
			{
				System.out.print(arr[i][j]+" KG  | ");
			}
			System.out.println();
		}
		scan.close();
	}

}
