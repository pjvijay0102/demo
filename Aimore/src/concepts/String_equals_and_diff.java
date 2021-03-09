package concepts;

public class String_equals_and_diff {

	public static void main(String[] args) {
		String vijay = new String("welcome");
		String hari = new String("welcome");
		
		if(hari == vijay)
			System.out.println("true");
			else
				System.out.println("false");
		
		boolean value=vijay.equals(hari);
		System.out.println("equals concept---> "+value);
	}

}
