import java.util.Scanner;

public class LearningScanner

{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1;
		int num2;
		int num3;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your first num");
		num1 = sc.nextInt();
		System.out.println("enter your second num");
		num2 = sc.nextInt();
		System.out.println("enter your third num");
		num3 = sc.nextInt();
		int num4 = num1 + num2 + num3;
		System.out.println("Sum of three numbers is" + num4);
	}

}
