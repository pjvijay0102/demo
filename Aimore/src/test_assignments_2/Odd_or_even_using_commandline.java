package test_assignments_2;

public class Odd_or_even_using_commandline {

	public static void main(String[] args) {
		int a=Integer.parseInt(args[0]);
		if(a%2==0)
			System.out.println(a+" is a Even number ");
		else
			System.out.println(a+" is a Odd number ");
	
	}

}
