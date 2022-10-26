package encapsulationlear;

public class EmployeeDetails {
	private String employeeId;
	private int pinCodeToEnter;
	private int payBalance;

	public EmployeeDetails(String empID, int pinCod, int payB) {
		employeeId = empID;
		pinCodeToEnter = pinCod;
		payBalance = payB;
	}

	public String getEmployeeId() {

		return employeeId;

	}

	public void setpayBalance(int pin, boolean attendance) {
		if (pinCodeToEnter == pin) {
			if (attendance == true) {
				System.out.println("Your pay is updated");
				payBalance = payBalance + 600;

			} else {
				System.out.println("Your pay is not updated,because you are not worked this week");
			}
		} else {
			System.out.println("pin code is not correct");

		}

	}

	public int getpayBalance() {
		return payBalance;
	}

	public void setPincode(int pinCod, int newPincod) {
		if (pinCodeToEnter == pinCod) {
			pinCodeToEnter = newPincod;
		} else {
			System.out.println("you are entering wrong pin code to enter,you cannot change");
		}

	}

}