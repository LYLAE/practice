import java.util.Scanner;

public class practice_210805_2 {
	public static void main(String[] args) {
		
		System.out.println("������ �Է��ϼ���.");
		
		
		Scanner inputNum = new Scanner(System.in);
		int score = inputNum.nextInt();
		
		switch (score) {
		case 90:
			System.out.println("score is 90");
			break;
		case 80:
			System.out.println("score is 80");	
			break;
		case 70:
			System.out.println("score is 70");
			break;
		case 60:
			System.out.println("score is 60");
			break;
		case 50:
			System.out.println("score is 50");
			break;
		default:
			System.out.println("score?");
			break;
		}
		
		inputNum.close();
		
		
	}

}