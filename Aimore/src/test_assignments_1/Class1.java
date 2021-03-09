package test_assignments_1;

public class Class1 {

	public static void main(String[] args) {
		Class2 object=new Class2();  //object creation for Class2
		
		object.M1();
		String b=object.name;  //instance variable calling for Class2 to Class1
		int c=Class2.a; 	//static variable calling for Class2 to Class1
		System.out.println(b);  
		System.out.println(c);  
	}

}
