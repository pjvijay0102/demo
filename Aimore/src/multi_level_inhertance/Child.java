package multi_level_inhertance;

public class Child extends Parent {
	 static Child ch=new  Child();
	public static void main(String[] args) {
		 
		ch.m3();

	}
	void m3(){
		
			ch.m1();
			int c=ch.a;
			String d=ch.b;
			System.out.println(c);
			System.out.println(d);
			ch.m2();
			System.out.println(ch.z);
			System.out.println(ch.x);
			
	}
}




