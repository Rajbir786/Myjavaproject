
public class switchStat {

	public static void main(String[] args) {
		int firstNum = 5;
		int secondNum = 3;
		int result;
		char operator = '+';

		switch (operator) {
		case '+':
			result = firstNum + secondNum;
			System.out.println("Addition of  numbers" + result);
			break;
		case '-':
			result = firstNum - secondNum;
			System.out.println("Subtraction of  numbers" + result);
			break;
		case '*':
			result = firstNum * secondNum;
			System.out.println("multiplication of  numbers" + result);

			break;
		case '/':
			result = firstNum / secondNum;
			System.out.println("Division of numbers " + result);
			break;

		default:

		{
			System.out.println("invalid operator");
			break;
		}
		}
	}

}
