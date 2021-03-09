package fileHandling;

import java.io.FileInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class File_InputStream_demo {

	public static void main(String[] args) {

		m1();
	}

	static void m1() {

		FileInputStream in = null;
		FileOutputStream out = null;

		try {
			in = new FileInputStream("input");
			out = new FileOutputStream("out");
			int c = 0;
			while ((c = in.read()) != -1) {
				out.write(c);
				
			}
			System.out.println(out + " success");

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				in.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
