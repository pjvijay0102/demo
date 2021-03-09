package test_assignments_2;

public class Sumvalue_using_commandline {

	public static void main(String[] args) {
		int count=0;
		int sum=0;
		
		for(int i=0;i<args.length;i++){
			int a=Integer.parseInt(args[i]);
			sum = sum+a;
			count++;
		}
		System.out.println("It is a sum value --> "+sum);
		System.out.println("It is a Avg value --> "+ (sum/count) );
	}

}
//input 1+2+3+4