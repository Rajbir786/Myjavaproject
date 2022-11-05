package asign6;

public class ArraycHAR {
	public static void main(String args[]) {
		String randomName="Rajbir";
		String maskedName=randomName.replaceAll("\\w", "_");
		char[] maskedNameChar= randomName.toLowerCase().toCharArray();
	for(int i=0;i<maskedName.length();i++) {
		System.out.println(maskedNameChar[i]);
	}
	}

}
