package assignweek10UPDATED1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserDetails {
	private String name;
	private String userEmail;
	private String password;
	private String phoneNo;
	int numberOfAdults = 0;
	int totalNumOFChildren = 0;
	int numberOfChildrenMoreThanFiveYears = 0;
	private boolean EmailValid = false;
	Scanner sc = new Scanner(System.in);

	public void Signup() {
		System.out.println("please  signup to book a service");
		this.setName(name);
		this.setEmail(userEmail);
		this.setPassword(password);
		this.setPhoneNum(phoneNo);
		System.out.println("Thank you for registering!");

	}

	private void setName(String enteredname) {
		System.out.println("Enter your name");
		enteredname = sc.nextLine();
		while (((enteredname.length() > 20) || enteredname.length() < 3)) {
			System.out.println(" name length should be less than 20 and more than 3 words ");
			System.out.println("Enter your name again");
			enteredname = sc.nextLine();
		}
		this.name = enteredname;
	}

	private void setEmail(String enteredEmail) {
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

	private void setPassword(String enteredPassword) {

		System.out.println("Enter your password that you want to use for login");

		enteredPassword = sc.nextLine();
		while ((enteredPassword.length() > 20) || (enteredPassword.length() < 6)) {
			System.out.println(" password  length should be less than 20 and more than 6  ");
			System.out.println("Enter your password again");
			enteredPassword = sc.nextLine();

		}
		this.password = enteredPassword;

	}

	private void setPhoneNum(String enteredPhonenum)

	{
		Pattern p = Pattern.compile("^\\d{10}$");
		System.out.println("Enter your PhoneNumber that you want to use for this website");
		enteredPhonenum = sc.nextLine();
		Matcher m = p.matcher(enteredPhonenum);

		while (!(m.matches())) {
			System.out.println("phone number is not valid try again");
			enteredPhonenum = sc.nextLine();
			m = p.matcher(enteredPhonenum);

		}
		this.phoneNo = enteredPhonenum;

	}

}
