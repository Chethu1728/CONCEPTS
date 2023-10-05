package com.kodnest.ccc;

public class DoWhileNested {

	public static void main(String[] args) {
		int i=1;
		do {
			int j=1;
			while(j<=5) {
				System.out.print("Kodnest ");
				j++;
			}
			System.out.println();
			i++;
		}while(i<=5);
		System.out.println("Technologies");
	}

}