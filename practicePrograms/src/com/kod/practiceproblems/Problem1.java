package com.kod.practiceproblems;
import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		long res=add();
		System.out.println(" addition result is "+ res);
	}
	public static long add()
	{
		int a=scanInt();
		long b=9876543210l;
		long c=a;
		return b+c;
	}

}
