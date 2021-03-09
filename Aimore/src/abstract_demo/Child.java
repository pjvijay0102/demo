package abstract_demo;

public class Child extends Parent {
	
	public static void main(String[] args) {
		Parent obj=new Child();
		Child o=new Child();
		obj.v1();
		obj.m2();
//		obj.v2();//it will compile time error
		
	}
	
	
	public void v1() {
		
		System.out.println("Child class");
	}
	void v2(){
		System.out.println("asbdka");
	}

}

