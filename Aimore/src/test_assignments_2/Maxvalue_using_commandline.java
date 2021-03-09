package test_assignments_2;

public class Maxvalue_using_commandline {

	public static void main(String[] args) {

		int temp = 0;
//		int a[] = null;
		for (int i = 0; i < args.length; i++) {

			// a[i].toString() =Integer.parseInt(args[i]);
			int b = Integer.parseInt(args[i]);
			if (b > temp) {
				temp = b;

			}
		}
		System.out.println(temp + " ---> is a large value");
	}

}
