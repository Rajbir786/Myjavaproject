package constructorAssignmentBankQues;

import java.util.Scanner;

public class BankDetails {
	int balance;
	int pinCode;
	int accountNumber;
	int withDrawMoney = 0;
	int depositMoney = 0;
	int numOfAttempts = 0;

	BankDetails(int accNum, int pinCodeUser, int balanceOfuser)

	{
		accountNumber = accNum;
		pinCode = pinCodeUser;
		balance = balanceOfuser;

	}

	Scanner sc = new Scanner(System.in);

	public int withdraw(int index) {

		System.out.println("How much money do you want to withdraw");

		withDrawMoney = sc.nextInt();
		while (!(withDrawMoney <= balance)) {

			numOfAttempts++;
			if (numOfAttempts > 2) {
				System.out.println("You have entered more than 3 times");
				System.exit(0);
			}

			System.out.println("withdraw amount should be less than available balance,try again ");
			withDrawMoney = sc.nextInt();

		}

		if (withDrawMoney <= balance) {

			balance = (balance - withDrawMoney);
		}

		return balance;

	}

	public int depositMoney(int index) {

		System.out.println("How much money do you want to deposit");

		depositMoney = sc.nextInt();
		balance = (balance + depositMoney);

		return balance;

	}

}