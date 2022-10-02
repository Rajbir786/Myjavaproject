
public class switchCase {

	public static void main(String[] args) {
		int customerOrderNo = 6;
		switch (customerOrderNo) {
		case 1:
			System.out.println(" Black Coffee will be served");
			break;
		case 2:
			System.out.println(" Black Coffee with toast will be served");
			break;
		case 3:
			System.out.println("Green tea will be served");
			break;
		case 4:
			System.out.println("Black tea will be served");
			break;
		case 5:
			System.out.println("Apple juice will be served");
			break;
		case 6:
			System.out.println("Orange juice will be served");
			break;

		default:

		
			System.out.println("Enter valid entry it should be in between 1-6 only");
			break;
		
		}
	}

}
