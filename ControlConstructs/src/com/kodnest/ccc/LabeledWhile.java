package com.kodnest.ccc;

public class LabeledWhile {
	public static void main(String[] args) {
		int i=1;
	abcd:while(i<=5) {
		int j=1;
		efgh:while(j<=5) {
			System.out.println("@ ");
			j++;
			break abcd;
		}
		i++;
		System.out.println("CR7");
	}
}

}
