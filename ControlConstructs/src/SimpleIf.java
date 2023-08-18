import java.util.Scanner;

public class SimpleIf {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println(" Enter The Marks");
		int marks=scan.nextInt();
		System.out.println(" Welcome To Kodnest");
		checkTheMarks(marks);
	}

		public static void checkTheMarks(int marks)
		{
			// Sample if conditional control construct
			if(marks>=80)
				System.out.println("Welcome to Tech Club");
		}
}
