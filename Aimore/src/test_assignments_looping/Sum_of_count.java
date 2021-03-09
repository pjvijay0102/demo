package test_assignments_looping;

public class Sum_of_count {
	 
	public static void main(String[] args) {
		int a=Integer.parseInt(args[0]);
		int sum=0;
		for(int i=0;i<=a;i++){
			sum=sum+i;
		}
		System.out.println(sum);
	}
		
}
