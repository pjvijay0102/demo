package test_assignments_3_switch;

public class Employee {

	public static void main(String[] args) {
		String a=args[0];
		String b=args[1];
		
		switch (a) {
		case "tcs": {

			switch (b) {
			case "softwaredeveloper":
				System.out.println("software developer of tcs a name : vijay");
				break;
			case "hr":
				System.out.println("hr of tcs a name : ram");
				break;
			case "testingteam":
				System.out.println("testing team of tcs a name : raj");
				break;
			case "maintanance":
				System.out.println("maintanance team of tcs a name : raja");
				break;
			}
			break;
		}

		case "ibm": {

			switch (b) {
			case "softwaredeveloper":
				System.out.println("software developer of ibm a name : vijay");
				break;
			case "hr":
				System.out.println("hr of ibm a name : ram");
				break;
			case "testingteam":
				System.out.println(" testing team of ibm a name : raj");
				break;
			case "maintanance":
				System.out.println(" maintanance team of ibm a name : raja");
				break;
			}
			break;
		}

		case "infosis": {

			switch (b) {
			case "softwaredeveloper":
				System.out.println("software developer of infosis a name : vijay");
				break;
			case "hr":
				System.out.println("hr of infosis a name : ram");
				break;
			case "testingteam":
				System.out.println(" testing team of infosis a name : raj");
				break;
			case "maintanance":
				System.out.println(" maintanance team of infosis a name : raja");
				break;
			}
			break;
				
			}
			default :
				System.out.println("You only find tcs,ibm,infosis company details only");
		

		}
	}
}
