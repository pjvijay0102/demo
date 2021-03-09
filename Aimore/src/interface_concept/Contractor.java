package interface_concept;

public class Contractor implements Bank {
	public void staff_details(){
		System.out.println("Staff details");
		
	}
	 public void n1(){
		System.out.println("n1 method");
	}
	 public static void main(String[] args) {
		Bank c=new Contractor();
		c.n1();
	}
}
