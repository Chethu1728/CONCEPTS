package com.kodnest.java.arrayprograms;


import java.util.Arrays;

public class MissMatch {
	public static void main(String[] args)
	{

		int intArr[] = { 10, 20, 15, 22, 35 };

		int intArr1[] = { 10, 20, 22 };

		System.out.println("The element mismatched at index: "+ Arrays.mismatch(intArr, intArr1));
	}
}

