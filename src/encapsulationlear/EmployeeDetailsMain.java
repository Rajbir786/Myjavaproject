package encapsulationlear;

public class EmployeeDetailsMain {
	public static void Main(String args[]) {
		EmployeeDetails rajbir = new EmployeeDetails("2345689", 6789, 500);

		rajbir.setpayBalance(6789, true);
		rajbir.getpayBalance();
		rajbir.setPincode(6789, 1234);
	}
}