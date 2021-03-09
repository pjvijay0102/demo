package test_assignments_2;

public class DrivingID_using_commandline {

	
	public static void main(String[] args) {
	
			eligibilitycheck(Integer.parseInt(args[0]));
	}
	
	
	static void eligibilitycheck(int a){
		if(a<=18)
			System.out.println(a+"is not eligible for driving");
		else
			System.out.println(a+"is  eligible for driving");
	}

}
