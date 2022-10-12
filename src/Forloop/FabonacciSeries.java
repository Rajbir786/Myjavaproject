package Forloop;

public class FabonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num1=0;
int num2=1;
System.out.print(num1);
System.out.print(num2);
	for(int i=2;i<=17;i++) {
	int	num3=num2+num1;
	
	System.out.print(""+num3);	
		num1=num2;
		num2=num3;
	}
	}
}
