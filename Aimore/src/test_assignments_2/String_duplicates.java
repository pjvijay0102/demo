package test_assignments_2;

public class String_duplicates {

	public static void main(String[] args) {

		String name = "Welcome to java class";

		String name1 = name.toUpperCase();

	String at = name1.trim();

		char[] a = at.toCharArray();
		for (int i = 0; i < at.length(); i++) {
			int count = 1;
			for (int j = i + 1; j < at.length(); j++) {
				if (a[i] == a[j] && (a[j]) != '0') {
					count++;

					System.out.println(a[j] + " count " + count);
					a[j] = '0';
				}
			}
			
		}

	}

}
