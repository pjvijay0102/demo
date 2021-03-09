package hybird_inhertance;

public class A extends C{

	public static void main(String[] args) {
	
		int[] b={10,20,30,40,50,10,10,90};
		
		System.out.println(b.length);
		for(int i=0;i<b.length;i++){
			
		//for(int i=10;10<7;i++)
			int c=0;
			for(int j=0;j<b.length;j++){
				
				
				if(b[i]==b[j]){
					c++;
				}
				
			}
			System.out.println("th value"+c);
			
			
		}
		
	}

}
