package abc;

import java.io.FileOutputStream;

public class TestOutputStream {

	public static void main(String[] args) {
		try {
			FileOutputStream f = new FileOutputStream("put.txt");
			for(int i=97; i<=122;i++)
			{
				f.write(i);
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Done");
	}
}
