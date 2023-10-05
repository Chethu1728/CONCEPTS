package com.kodnest.ccc;

public class LabeledDoWhile {
	public static void main(String[] args) {
		int i=0;
	abcd:do
	{
		i++;
		int j=1;
		e:do
		{
			System.out.println("@ ");
			j++;
			if(j==3) {
			break abcd;
			}
		}while(j<=5);
	}while(i<=5);
}

}
