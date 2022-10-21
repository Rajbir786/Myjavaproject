package constructorAssignmentBankQues;

import java.util.Scanner;

public class BankDetailsMain {

	public static void main(String args[]) {

		int count = 0;
		int numOfTry = 0;
		BankDetails ramsingh = new BankDetails(97896543, 4567, 500);

		BankDetails shamsingh = new BankDetails(345278908, 3457, 1000);
		BankDetails radhasharma = new BankDetails(56790123, 6789, 2000);
		BankDetails ayshasharma = new BankDetails(34490823, 4320, 1500);
		BankDetails motisingh = new BankDetails(45899923, 2310, 2000);

		BankDetails bankDetails[] = { ramsingh, shamsingh, radhasharma, ayshasharma, motisingh };
		int enteredAccountNum;
		int enteredPinCode;
		int index = 0;
		int numOfAttempts = 0;
		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter your  account Number");
		enteredAccountNum = sc.nextInt();
		System.out.println("Please enter your  pinCode");
		enteredPinCode = sc.nextInt();

		for (int i = 0; i < bankDetails.length; i++) {
			if ((enteredAccountNum == bankDetails[i].accountNumber) && (enteredPinCode == bankDetails[i].pinCode)) {
				count = 0;
				System.out.println("Welcome to Bank");
				System.out.println("Your present Bank balance is  " + bankDetails[i].balance);
				index = i;

				break;
			} else {
				count = 1;
			}
		}

		if (count == 1) {

			System.out.println("Either your account number or pin code is incorrect try again");
			System.exit(0);

		}

		System.out.println("Would you like to deposit or withdraw money?");
		String enteredChoice = sc.next();
		while (!(enteredChoice.equals("withdraw") || enteredChoice.equals("deposit"))) 
			{
				numOfAttempts++;

				
			
				if (numOfAttempts >2) {
					System.out.println("You have entered more than 3 times");
					System.exit(0);

				}
				System.out.println("you have entered invalid  input,please type either withdraw or deposit");
				enteredChoice = sc.next();
			}
		
		if (enteredChoice.equals("withdraw")) {
			System.out.println("Withdraw successful,your updated balance is   " + bankDetails[index].withdraw(index));

		} else if (enteredChoice.equals("deposit")) {
			System.out.println(" Your money deposit is successful and Your updated balance is    "
					+ bankDetails[index].depositMoney(index));

		}

	}
}
