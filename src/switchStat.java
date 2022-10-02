
public class switchStat {

	public static void main(String[] args) {
		int dayofGame= 14;
		switch(dayofGame)
		{
		case 1:
			System.out.println("Today is hockey game day");
			break;
		case 2:
			System.out.println("Today is football game day");
			break;
		case 3:
			System.out.println("Today is tennis game day");
			break;
			case 4:
				System.out.println("Today is volleyball game day");
				break;
				case 5:
					System.out.println("Today is badminton game day");
					break;
					case 6:
						System.out.println("Today is  cricket game day");
						break;
					case 7:
						System.out.println("Today is soccer game day");
						break;
						default:
							
						{
							System.out.println("Enter valid entry it should be in between 1-7 only");
							break;
						}
		}}
							
}
