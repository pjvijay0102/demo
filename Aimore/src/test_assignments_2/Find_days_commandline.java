package test_assignments_2;

public class Find_days_commandline {

	public static void main(String[] args) {
		
		int a = Integer.parseInt(args[0]);
		switch (a) {
		case 0:
			System.out.println("sunday");
			break;
		case 1:
			System.out.println("monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println(" Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		}

	}

}
