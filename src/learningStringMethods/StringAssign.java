package learningStringMethods;

public class StringAssign {
	public static void main(String args[]) {
		String myName= ("Rajbir Kaler");
	 
		String myLastNamewithStar= myName.substring(myName.indexOf("Kaler")).replaceAll("\\w", "*");
		
		 String firstName=myName.substring(0,myName.indexOf(" "));
		 System.out.println("My first name is"+firstName);
		System.out.println("My  name with starPrintedLastName "+firstName+myLastNamewithStar);
		
	
		
		
		 System.out.println("Length of my name with spaces is"+myName.length());
		
		 
		 System.out.println("Length of my name without spaces is"+myName.replace(" ", "").length());
		
		 System.out.println("My name after replacing e with a   "+myName.replace("a","e"));
		
		 
		
		 
		 
		
		 
		

	}

}
