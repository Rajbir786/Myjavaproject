package Forloop;

public class Factorial {
	public static void main(String args[]) {
int num=8;
long factorial=1;
if(num==1)
{
	System.out.println("factorail of num is 1");
}
else
{
for(int i=1;i<=num;i++)
{
	factorial=factorial*i;
}
	System.out.println("facorail of number is"+factorial);
}}}