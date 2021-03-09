package test_assignments;

public class Class1 {

	public static void main(String[] args) {
		Class2 object=new Class2(); //object creation for Class2
		Class2.Method1(); // this step for calling a static method
		
		object.Method2(); //this step for calling a non-static method
	}

}
