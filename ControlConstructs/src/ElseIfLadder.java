import java.util.Scanner;

public class ElseIfLadder {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the score");
		int score=scan.nextInt();
		Grade g=new Grade();
		g.grade(score);
		
		
	}

}
