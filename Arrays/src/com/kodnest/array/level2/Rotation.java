package com.kodnest.array.level2;

public class Rotation {
	static void clockwiseRotate(int arr[],int n)
	{

	    // Logic for Clockwise rotation
		for(int i=1;i<=n;i++)
		{
			int temp=arr[arr.length-1];
			for(int j=arr.length-2;j>=0;j--)
			{
				arr[j+1]=arr[j];
			}
			arr[0]=temp;
		}
	}
		static void antiClockwiseRotate(int arr[],int n)
		{
		 // Logic for Anti Clockwise rotation
		for(int i=1;i<=n;i++)
		{
			int temp=arr[0];
			for(int j=1;j<=arr.length-1;j++)
			{
				arr[j-1]=arr[j];
			}
			arr[arr.length-1]=temp;
		}
	}	


}
