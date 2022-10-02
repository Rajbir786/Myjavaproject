
public class LicenseIssue {

	public static void main(String[] args) {
		int age=14;
		String currentLevel="";
		if(age>=16&& currentLevel=="")
		{
			System.out.println("Candidate is eligible for driving license and can apply for Class7");
		}
		else if (age>=16&& currentLevel=="Class7")
		{
			System.out.println("Class5 will be issued after 2 years driving experience of Class7");
		}
		else if(age>16&& currentLevel=="Class5")
		{
			System.out.println("Class1 will be issued after 2 years experience of Class5");
		}
		else if(age>16&& currentLevel=="Class1")
		{
		System.out.println("candidate already has Higher level of driving license");
		
		}
		else
		{
			System.out.println("Candidate is not eligible for any driving license yet ");
		}

	}

}
