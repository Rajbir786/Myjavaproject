package overriding;

public class MainClass {
	public static void main(String args[]) {
	
	Class1 a =new Class1();
	a.hstCalucalte();
	a =new Class2();
	 a.hstCalucalte();
	 a =new Class3();
	a.hstCalucalte();

}
}