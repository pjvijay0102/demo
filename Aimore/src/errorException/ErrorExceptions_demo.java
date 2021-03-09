package errorException;
import java.lang.Exception;
public class ErrorExceptions_demo {

	public static void main(String[] args)throws Exception  {
		
	
		m1();
	}
	static void m1()throws Exception{
		int []b={1,2,3,4};
		System.out.println(b[10]);
		System.out.println("hai");
	}
}
