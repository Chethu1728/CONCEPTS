package com.kodnest.ccc;

public class LabeledFor {

	public static void main(String[] args) {
		abcd:for(int i=1;i<=5;i++) {
			efgh:for(int j=1;j<=5;j++) {
				System.out.println("** ");
				break abcd;
			}
			System.out.println("CR7");
		}
	}

}
