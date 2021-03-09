package concepts;

public class commandline_arg {
	public static void main(String[] argss) {
//		commandline_arg obj= new commandline_arg();
		me(argss);
		
		}
	static void me(String[] argss){
		int a=Integer.parseInt(argss[0]);
		int b=Integer.parseInt(argss[1]);
		System.out.println(" 1st value \t"+ a);
		System.out.println("2nd value \t"+b);
		System.out.println(a+b);
	}
	
}
