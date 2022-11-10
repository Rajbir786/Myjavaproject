package assignmnetweek10;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserDetailClass {
	private String name;
	private String userEmail;
	private String password;
	private String phoneNo;
	String enteredname;

	String enteredPassword = "";
	String enteredEmail;
	int numberOfAdults = 0;
	int totalNumOFChildren=0;
	int numberOfChildrenMoreThanFiveYears = 0;
	String enteredPhonenum;
	boolean EmailValid = false;
	Scanner sc = new Scanner(System.in);


	public void setName() {
		
			System.out.println("Enter your name");
			enteredname = sc.nextLine();
			while (((enteredname.length()>20)|| enteredname.length()<3)) {
				System.out.println(" name length should be less than 20 and more than 3 words ");
				System.out.println("Enter your name again");
				enteredname= sc.nextLine();
				
			}
       this.name = enteredname;
		
	

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
			
			 String enteredPassword=sc.nextLine().replaceAll("\\w", "*");
			

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
		while (!(m.matches()))
		{

			
				System.out.println("invalid Phonenumber");

				System.out.println("Enter your Phone number again");
				enteredPhonenum = sc.nextLine();
		}
		this.phoneNo=enteredPhonenum;
			
	}
	public void totalNoOfUser() {

		System.out.println("Enter number of adults");
		numberOfAdults = sc.nextInt();
		System.out.println("Enter number of children");
		totalNumOFChildren = sc.nextInt();
		int ageOfChildren[] = new int[totalNumOFChildren];
		if (totalNumOFChildren > 0) {
			for (int j = 0; j < totalNumOFChildren; j++) {
				System.out.println("Enter the age of child" + (j + 1));
				ageOfChildren[j] = sc.nextInt();

				if (ageOfChildren[j] > 5) {
					numberOfChildrenMoreThanFiveYears = numberOfChildrenMoreThanFiveYears + 1;

				}
				
				
			}
			HotelBooking hbook=new HotelBooking ();
			hbook.priceHotelStay();
		}
	
		
	}
	
		
}
	
	


