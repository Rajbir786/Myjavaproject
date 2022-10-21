package constructor;

import java.util.Scanner;
import java.util.Scanner;
public class LibraryMain {


		

			public static void main(String[] args) {
				
				
				LibraryBookDetails romeoAndJuliet = new LibraryBookDetails("Romeo and Juliet", "Shakespere");
				LibraryBookDetails peaceOfMind = new LibraryBookDetails("Peace of Mind", "Allen");
				LibraryBookDetails  homeBody = new LibraryBookDetails ("Home Body", "Rupi Kaur");
				LibraryBookDetails  twoStates = new LibraryBookDetails ("Two States", "Chetan Bhagat");
				LibraryBookDetails halfGirlfriend = new LibraryBookDetails("Half Girlfriend", "Chetan Bhagat");
				LibraryBookDetails oliverTwist = new LibraryBookDetails("Oliver Twist", "Charles Dickens");
				LibraryBookDetails macbeth = new LibraryBookDetails("Macbeth", "Shakespere");
				LibraryBookDetails harrypotter1 = new LibraryBookDetails("Harry Potter and the Sorcere's Stone", "J K Rowling");
				LibraryBookDetails malgudyDays = new LibraryBookDetails("Malgudy Days", "R K Narayan");
				LibraryBookDetails alchemist = new LibraryBookDetails("Alchemist", "Paulo Coehlo");
				
				//Array of Objects
				LibraryBookDetails[] bookDetails = {romeoAndJuliet, peaceOfMind, homeBody, twoStates, halfGirlfriend, oliverTwist, macbeth, harrypotter1,malgudyDays,alchemist};
				Scanner sc = new Scanner(System.in);
				int bookCount = 0;
				
				
				do {
				
				System.out.println("Which book you want to be issued");
				String requiredBookName = sc.nextLine();
				System.out.println("Who is the author");
				String bookAuthor = sc.nextLine();
						
				//iterating over the array
				for (int i = 0; i < bookDetails.length; i++) {
					if(requiredBookName.equals(bookDetails[i].bookName)&& bookAuthor.equals(bookDetails[i].authorName)&&bookDetails[i].isBookIssued) {
						System.out.println("book is issued already");
						break;
					}
					if(requiredBookName.equals(bookDetails[i].bookName)&& bookAuthor.equals(bookDetails[i].authorName)&&!bookDetails[i].isBookIssued)
					{
						
						
					bookDetails[i].isBookIssued = true;
					System.out.println(bookDetails[i].bookName+ " is issued");
				
					bookCount++;
					break;
					}
				}
				
				
				}
				 while(bookCount<3);
			
				
				
				

				}}


