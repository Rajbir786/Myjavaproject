package AssignmentWeek8;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SignUp {

	private String name;
	private String userEmail;
	private String password;
	private String phoneNo;
	int numOfAttPhn = 0;
	int numOfAtt = 0;
	int numOfAttEmail = 0;
	int numOfAttemptsLogin = 0;
	public String customerenteredNewPhoneNum;
	public String customerenteredNewEmail;
	public String customerenteredExistingPassword;
	Scanner sc = new Scanner(System.in);
	int count = 0;
	String enteredname;

	String enteredPassword = "";
	String enteredEmail;

	String enteredPhonenum;

	boolean EmailValid = false;

	public void setName() {
		do {
			System.out.println("Enter your name");
			enteredname = sc.nextLine();

			if ((enteredname.length() > 20)) {
				System.out.println(" name length should be less than 20 ");

			} else {
				this.name = enteredname;
			}
		} while (!((enteredname.length() < 20)));

	}

	public void setEmail() {
		do {
			System.out.println("Enter your Email that you want to use for login");
			enteredEmail = sc.nextLine();

			String regexPattern = "^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@"
					+ "[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";
			boolean EmailValid = enteredEmail.matches(regexPattern);
			if (!EmailValid)

			{

				System.out.println("invalid email");

				System.out.println("Enter your Email again");
				enteredEmail = sc.nextLine();

			} else {
				this.userEmail = enteredEmail;
			}

		} while (EmailValid);

	}

	public void setPassword() {
		do {

			System.out.println("Enter your password that you want to use for login");
			enteredPassword = sc.nextLine();

			if ((enteredPassword.length() > 10)) {
				System.out.println("password length should be less than 20 ");
			} else {
				this.password = enteredPassword;
			}
		} while (!((enteredPassword.length() < 10)));

	}

	public void setPhoneNum() {
		Pattern p = Pattern.compile("^\\d{10}$");

		System.out.println("Enter your PhoneNumber that you want to use for this website");
		enteredPhonenum = sc.nextLine();
		Matcher m = p.matcher(enteredPhonenum);
		do {

			if (!(m.matches())) {
				System.out.println("invalid Phonenumber");

				System.out.println("Enter your Phone number again");
				enteredPhonenum = sc.nextLine();

			} else {
				this.phoneNo = enteredPhonenum;

			}
		} while (!(m.matches()));

	}

	public void loginFunc() {
		System.out.println("Now you can  login");
		System.out.println("Enter your  registered Email");
		String enteredUsernameLogin = sc.nextLine();
		System.out.println("Enter your password");
		String enteredPasswordForLogin = sc.nextLine();

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

	public boolean passwordMatch() {
		System.out.println("Enter your existing password to verify your identity");
		customerenteredExistingPassword = sc.nextLine();

		boolean passwordPassMatch = customerenteredExistingPassword.matches(password);
		while (!passwordPassMatch) {
			System.out.println("incorrect entered password");

			customerenteredExistingPassword = sc.next();
			numOfAtt++;
			if (numOfAtt > 2) {
				System.out.println("You have entered more than 3 times invalid password");
				System.exit(0);
			}

		}
		return passwordPassMatch;

	}

}
