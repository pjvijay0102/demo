package test_assignments_3_switch;

public class Switch_using_arithmatic {

	public static void main(String[] args) {
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[2]);
		switch(args[1]){
		case "+":
			System.out.println(a+b);
			break;
		case "-":
			System.out.println(a-b);
			break;
		case "*":
			System.out.println(a*b);
			break;
		case "/":
			System.out.println(a/b);
			break;
		
		case "%":
			System.out.println(a%b);
			break;
		default:	
			System.out.println("This is not a arithmatic operations" );
		}
	}
}
