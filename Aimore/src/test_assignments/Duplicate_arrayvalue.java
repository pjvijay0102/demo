package test_assignments;

public class Duplicate_arrayvalue {
	
	public static void main(String[] args) {
		int []a={10,20,30,10,10,10};
//		for(int i=0;i<a.length-1;i++){
//			int temp=a[i];
//			 int count=0;
//			for(int j=0;j<a.length;j++){
//				if( (a[j]==temp) &&(!(a[j]==-1) ) ){
//					count++;
//					a[j]=-1;
//					
//				}
//			}
//			System.out.println(a[i]+": th count is: "+count);
//		
//		}
		for(int i=0;i<a.length;i++){
			int count=0;
		
			for(int j=0+i;j<a.length;j++){
				if( (a[i]==a[j]) &&(!(a[j]==-1) ) ){
					count++;

					
				}
				System.out.println(a[j]);
			}
			
//			System.out.println(a[i]+"\t"+count);
		}
	}

}
