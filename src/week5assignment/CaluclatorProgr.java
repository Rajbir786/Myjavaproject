package week5assignment;

public class CaluclatorProgr {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int firstNum = 5;
		int secondNum = 3;
		int result;
		char operator = '+';

		switch (operator) {
		case '+':
			result = firstNum + secondNum;
			System.out.println("Addition of  numbers is " + result);
			break;
		case '-':
			result = firstNum - secondNum;
			System.out.println("Subtraction of  numbers is " + result);
			break;
		case '*':
			result = firstNum * secondNum;
			System.out.println("multiplication of  numbers is " + result);

			break;
		case '/':
			result = firstNum / secondNum;
			System.out.println("Division of numbers is " + result);
			break;

		default:

		
			System.out.println("invalid operator");
			break;
		
		}
	}

}
