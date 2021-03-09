package test_assignments_looping;

public class Large_using_arr {
	
	public static void main(String[] args) {
		
		int [ ]arr={1,12,3,4,15,6,7,8,99};
		int temp=0;
		
		for(int i=0;i<arr.length;i++){
			
				if(arr[i]>temp)
				temp=arr[i];
			}
			
		
		System.out.println(temp);
	}

}
