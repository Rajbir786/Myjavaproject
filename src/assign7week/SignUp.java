package assign7week;

import java.util.Scanner;

public class SignUp {

	private String name;
	private String userEmail;
	private String password;
	private long phoneNo;
	int numOfAttPhn = 0;
	int numOfAtt = 0;
	int numOfAttEmail = 0;
	int numOfAttemptsLogin = 0;
	public long customerenteredNewPhoneNum;
	public String customerenteredNewEmail;
	public String customerenteredExistingPassword;
	Scanner sc = new Scanner(System.in);
	
	public String getname() {
		return name;

	}

	public void setname(String name) {
		this.name = name;
	}

	public void setuserEmail(String enteredEmail) {

		this.userEmail = enteredEmail;
	}

	public void setpassword(String enteredPassword) {
		this.password = enteredPassword;
	}

	public void setphoneNumber(long phnNum) {
		this.phoneNo = phnNum;
	}

	public void loginFunc(String enteredUsernameLogin, String enteredPasswordForLogin) {
		while (!(enteredUsernameLogin.equals(userEmail) && enteredPasswordForLogin.equals(password))) {
			System.out.println("you have entered non-registered Email or invalid password");
			System.out.println("Please enter your registered Email");

			enteredUsernameLogin = sc.nextLine();
			System.out.println("Enter your password");
			enteredPasswordForLogin = sc.nextLine();

			numOfAttemptsLogin++;
			if (numOfAttemptsLogin > 2) {
				System.out.println("You have entered more than 3 times invalid cruise name");
				System.exit(0);
			}

		}

		if (enteredUsernameLogin.equals(userEmail) && enteredPasswordForLogin.equals(password)) {
			System.out.println("You are successfuly login");

		}
	}

	public void setupdatePassword(String enteredPassword) {
		System.out.println("Enter your existing password");
		customerenteredExistingPassword = sc.next();
		while (!(customerenteredExistingPassword.equals(enteredPassword))) {
			System.out.println("incorrect entered password");

			customerenteredExistingPassword = sc.next();
			numOfAtt++;
			if (numOfAtt > 2) {
				System.out.println("You have entered more than 3 times invalid password");
				System.exit(0);
			}

		}
		if (customerenteredExistingPassword.equals(enteredPassword)) {
			System.out.println("Enter new password");
			String customerenteredNewPassword = sc.next();
			this.password = customerenteredNewPassword;
			System.out.println("Your password has been changed!");

		}

	}

	public void setUpdatePhonenum(long enteredPhonenum) {
		System.out.println("Enter your existing phonenumber");
		long customerenteredExistingPhoneNum = sc.nextLong();
		while (!(customerenteredExistingPhoneNum == enteredPhonenum)) {
			System.out.println("incorrect entered phonenumber");

			customerenteredExistingPhoneNum = sc.nextLong();
			numOfAttPhn++;
			if (numOfAttPhn > 2) {
				System.out.println("You have entered more than 3 times invalid phonenumber");
				System.exit(0);
			}
		}
		if (customerenteredExistingPhoneNum == enteredPhonenum) {
			System.out.println("Enter new phone number");
			customerenteredNewPhoneNum = sc.nextLong();

			this.phoneNo = customerenteredNewPhoneNum;
			System.out.println("Your phoneNUmber has been changed!");

		}

	}

	public void UpdateEmail(String enteredEmail) {

		System.out.println("Enter your existing Email");
		String customerenteredExistingEmail = sc.next();
		while (!(customerenteredExistingEmail.equals(enteredEmail))) {
			System.out.println("incorrect entered email");

			customerenteredExistingEmail = sc.next();
			numOfAttEmail++;
			if (numOfAttEmail > 2) {
				System.out.println("You have entered more than 3 times invalid email");
				System.exit(0);
			}
		}
		if (customerenteredExistingEmail.equals(enteredEmail)) {
			System.out.println("Enter new Email");
			customerenteredNewEmail = sc.next();

			this.userEmail = customerenteredNewEmail;
			System.out.println("Your Email has been changed!");

		}

	}

}
