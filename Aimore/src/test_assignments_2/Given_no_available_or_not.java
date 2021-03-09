package test_assignments_2;

public class Given_no_available_or_not {

	public static void main(String[] args) {
		
		int value=Integer.parseInt(args[0]);
		int [ ]arr={1,12,3,4,15,6,7,8,99};
		
		for(int i=0;i<arr.length;i++){
			if( (arr[i]==value) ){
				System.out.println("The given value is available "+value);
				
			}
				
		}
		System.out.println("The given value is sssss available "+value);
		

	}

}

	