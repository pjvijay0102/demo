package concepts;

public class Control_flow {
	 static int i = 0;
	public static void main(String[] args) {
		
		
		
		m2();
		System.out.println(i);
	}
	static	void m1(){
			for(;
					i<5
					;
					i++)
				System.out.println("ok");
			
		}
	static	void m2(){
			do
				System.out.println(i);
				
			 while (i > 10);
		}
		


 
}