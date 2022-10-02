import java.sql.SQLOutput;
import java.util.Scanner;

public class ConditionElseIf {

	public static void main(String[] args) {
		int num;
		System.out.println("enter your number");
	
Scanner obj=new Scanner(System.in);
num=obj.nextInt();
if(num>33&&num<=100)
	
{
	System.out.println("student is pass");
}
	else if(num<33)
	{
		System.out.println("student is FAIL");
	}
	else if(num>101)
	{
		System.out.println("entered num is over than total marks of exam");
	}
}

}
	
	
	
	
	
	
	
	
	
	
	



