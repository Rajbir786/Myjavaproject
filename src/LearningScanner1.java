import java.util.Scanner;
public class LearningScanner1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 String nameList[]= {"Rajbir","Parul","Harinder","Lekshmi","Shanti"};
 int numList[]= {10,12,8,5,8};
 System.out.println("my name is "+nameList[0]+"and i am "+(numList[0]+numList[1])+" years old");
 if(numList[2]==numList[4])
 {
	System.out.println("both are same number" ); 
 }
 else
 {
	 System.out.println("both are diffrent number");  
 }
 for (int num :numList)
 {
	System.out.println("numbers of array numList is"+num) ;
	if(numList[1]==10)
	{
		System.out.println("stop showing next values");
		break;
	}
 }
 
}}