package com.kodnest.java.arrayprograms;

import java.util.Arrays;

public class CompareArray {
	public static void main(String[] args)
	{
		String Arr[] = {"Chethan","Kavya","Prajwal"};

		String Arr1[] = {"Chethan","Kavya","Prakash"};

		System.out.println("String Arrays on comparison: "+ Arrays.compare(Arr1,Arr));
		int intArr[] = {10,20,30};

		int intArr1[] = {10,20,3};

		System.out.println("Integer Arrays on comparison: "+ Arrays.compare(intArr1,intArr));
	}
}

