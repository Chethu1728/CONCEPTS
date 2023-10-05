package com.kodnest.array.level2;

import java.util.Scanner;

public class KodnestSearchSort {
	Scanner scan=new Scanner(System.in);
	int linearSearch(int arr[],int key)
	{
		for(int i=0;i<=arr.length-1;i++)
		{
			if(arr[i]==key)
			{
				return i;
			}
		}
		return -1;
	}
	int binarySearch(int arr[],int key)
	{
		int low=0;
		int high=arr.length-1;
		while(low<=high)
			{
		int mid=(low+high)/2;
			if(key==arr[mid])
				{
				return mid;
				}
			else if(key<arr[mid])
				{
				low=mid+1;
				}
			else
				{
				high=mid-1;
				}
			}
		return -1;
		}
	
	void bubbleSortAscending(int arr[])
	{
		for(int i=0;i<=arr.length-2;i++)
			{
			for(int j=0;j<=arr.length-2-i;j++)
				{
				if(arr[j]>arr[j+1])
					{
						int help=arr[j];
						arr[j]=arr[j+1];
						arr[j+1]=help;
					}
				}
			}
		System.out.println("Array Elements after Sorting..");
		for(int i=0;i<=arr.length-1;i++)
		{
		System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	void bubbleSortDescending(int arr[])
	{
		for(int i=0;i<=arr.length-2;i++)
		{
			for(int j=0;j<=arr.length-2-i;j++)
				{
					if(arr[j]<arr[j+1])
					{
						int help=arr[j];
						arr[j]=arr[j+1];
						arr[j+1]=help;
					}
				}
		}
		System.out.println("Array Elements after Sorting..");
		for(int i=0;i<=arr.length-1;i++)
		{
		System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	void selectionSortAscending(int arr[])
	{
		int min;
		int pos;
		for(int i=0;i<=arr.length-2;i++)
		{
			min=arr[i];
			pos=i;
			for(int j=i+1;j<=arr.length-1;j++)
			{
				if(arr[j]<min)
				{
					min=arr[j];
					pos=j;
				}
			}
			int help=arr[i];
			arr[i]=arr[pos];
			arr[pos]=help;
		}
		System.out.println("Array Elements after Sorting..");
		for(int i=0;i<=arr.length-1;i++)
		{
		System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	void selectionSortDescending(int arr[])
	{
		int max;
		int pos;
		for(int i=0;i<=arr.length-2;i++)
		{
			max=arr[i];
			pos=i;
			for(int j=i+1;j<=arr.length-1;j++)
			{
				if(arr[j]>max)
				{
					max=arr[j];
					pos=j;
				}
			}
			int help=arr[i];
			arr[i]=arr[pos];
			arr[pos]=help;
		}
		System.out.println("Array Elements after Sorting..");
		for(int i=0;i<=arr.length-1;i++)
		{
		System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	void insertionSortAscending(int arr[])
	{
		for(int i=1;i<arr.length;i++)
		{
			int item=arr[i];
			int j=i-1;
			while(j>=0 && arr[j]>item)
			{
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=item;
		}
		System.out.println("Array Elements after Sorting..");
		for(int i=0;i<=arr.length-1;i++)
		{
		System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	void insertionSortDescending(int arr[])
	{
		for(int i=1;i<arr.length;i++)
		{
			int item=arr[i];
			int j=i-1;
			while(j>=0 && arr[j]<item)
			{
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=item;
		}
		System.out.println("Array Elements after Sorting..");
		for(int i=0;i<=arr.length-1;i++)
		{
		System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	int findMin(int arr[])
	{
		System.out.println("Press 1 for Searching before sorting");
		System.out.println("Press 2 for Searching after sorting");
		int choice=scan.nextInt();
		if(choice==1)
		{
			int item=arr[0];
			for(int i=1;i<arr.length;i++)
			{
				if(item>arr[i])
				{
					item=arr[i];
				}
			}
			return item;
		}
		else if(choice==2)
		{
			System.out.println("Press 1 for BubbleSort");
			System.out.println("Press 2 for SelectionSort");
			System.out.println("Press 3 for InsertSort");
			int choice1=scan.nextInt();
			if(choice1==1)
			{
				bubbleSortAscending(arr);
				return arr[0];
			}
			else if(choice1==2)
			{
				selectionSortAscending(arr);
				return arr[0];
			}
			else if(choice1==3)
			{
				insertionSortAscending(arr);
				return arr[0];
			}
		}
		else
		{
			System.out.println("Enter the correct choice");
		}
		return 0;
	}
	
	int findMax(int arr[])
	{
		System.out.println("Press 1 for Searching before sorting");
		System.out.println("Press 2 for Searching after sorting");
		int choice=scan.nextInt();
		if(choice==1)
		{
			int item=arr[0];
			for(int i=1;i<=arr.length-1;i++)
			{
				if(item<arr[i])
				{
					item=arr[i];
				}
			}
			return item;
			
		}
		else if(choice==2)
		{
			System.out.println("Press 1 for BubbleSort");
			System.out.println("Press 2 for SelectionSort");
			System.out.println("Press 3 for InsertSort");
			int choice1=scan.nextInt();
			if(choice1==1)
			{
				bubbleSortAscending(arr);
				return arr[arr.length-1];
			}
			else if(choice1==2)
			{
				selectionSortAscending(arr);
				return arr[arr.length-1];
			}
			else if(choice1==3)
			{
				insertionSortAscending(arr);
				return arr[arr.length-1];
			}
		}
		else
		{
			System.out.println("Enter the correct choice");
		}
	return 0;
	}
}
