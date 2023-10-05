package com.kodnest.array.level2;

import java.util.Scanner;

public class KodnestSearchSortMain {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter array length");
		int arr[]=new int[scan.nextInt()];
		System.out.println("Enter "+arr.length+" Elements");
		for(int i=0;i<=arr.length-1;i++)
		{
		arr[i]=scan.nextInt();
		}
		System.out.println("Array Elements Before Sorting..");
		for(int i=0;i<=arr.length-1;i++)
		{
		System.out.print(arr[i]+" ");
		}
		System.out.println();
		KodnestSearchSort kss=new KodnestSearchSort();
		while(true)
		{
			System.out.println("Enter your choice");
			System.out.println("Press 1 for   Searching");
			System.out.println("Press 2 for   Sorting");
			System.out.println("Press 3 for   finding Min or Max");
			System.out.println("Press any other for not execute");
			int choice=scan.nextInt();
			switch(choice)
			{
				case 1:
					System.out.println("1 for linear search or 2 for Binary search");
					int choice1=scan.nextInt();
					if(choice1==1)
					{
						System.out.println("Enter key to search");
						int key=scan.nextInt();
						int res=kss.linearSearch(arr,key);
						if(res>=0)
						{
							System.out.println("Key found @ "+res);
						}
						else
						{
							System.out.println("Key is not found");
						}
					}
					else if(choice1==2)
					{
						System.out.println("Enter key to search");
						int key=scan.nextInt();
						int res=kss.binarySearch(arr, key);
						if(res>=0)
						{
							System.out.println("Key found @ "+res);
						}
						else
						{
							System.out.println("Key is not found");
						}
					}
					else
					{
						System.out.println("Enter the Correct Choice1");
						return;
					}
					break;
					
				case 2:
					System.out.println("Press 1 for BubbleSort");
					System.out.println("Press 2 for SelectionSort");
					System.out.println("Press 3 for InsertSort");
					int choice2=scan.nextInt();
					if(choice2==1)
					{
						System.out.println("Press 1 for asceding sorting and 2 for descending sorting");
						int choice3=scan.nextInt();
						if(choice3==1)
						{
							kss.bubbleSortAscending(arr);
						}
						else if(choice3==2)
						{
							kss.bubbleSortDescending(arr);
						}
						else
						{
							System.out.println("Go to vasaan eye care and come back");
							return;
						}
						
					}
					else if(choice2==2)
					{
						System.out.println("Press 1 for asceding sorting and 2 for descending sorting");
						int choice3=scan.nextInt();
						if(choice3==1)
						{
							kss.selectionSortAscending(arr);
						}
						else if(choice3==2)
						{
							kss.selectionSortDescending(arr);
						}
						else
						{
							System.out.println("Go to vasaan eye care and come back");
							return;
						}
						
					}
					else if(choice2==3)
					{
						System.out.println("Press 1 for asceding sorting and 2 for descending sorting");
						int choice3=scan.nextInt();
						if(choice3==1)
						{
							kss.insertionSortAscending(arr);
						}
						else if(choice3==2)
						{
							kss.insertionSortDescending(arr);
						}
						else
						{
							System.out.println("Go to vasaan eye care and come back");
							return;
						}
					}
					else
					{
						System.out.println("Check your eyes once and enter ther correct choice2");
					}
					break;
				case 3:
					System.out.println("press 1 for finding minimum");
					System.out.println("press 2 for finding maximum");
					int choice4=scan.nextInt();
					if(choice4==1)
					{
						int res=kss.findMin(arr);
						System.out.println("The minimum valsue is "+res);
					}
					else if(choice4==2)
					{
						int res=kss.findMax(arr);
						System.out.println("The maximum value is "+res);
					}
					break;
				default:
					System.out.println("TATA BYE BYE ,,,,,,,");
					scan.close();
					return;
			}
		}

	}
}
