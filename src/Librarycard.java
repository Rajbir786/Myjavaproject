
public class Librarycard {
	public static void main(String args[])
	{
		boolean libraryCardId=false;
		boolean studentCard =true;
		boolean issuedBookAlready=true;
		
		if((libraryCardId||studentCard)&&issuedBookAlready)
		{
			System.out.println("new book would be issued");
			
		}
	
	else
	{
		System.out.println("new book would not be issued");
	}
}
}