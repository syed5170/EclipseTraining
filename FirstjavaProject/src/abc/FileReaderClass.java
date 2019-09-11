package abc;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderClass {

	public static void main(String[] args) {
		try {
			FileReader reader = new FileReader("put.txt"); 
			int i;
			try {
				while((i=reader.read())!=-1)
				{
					System.out.println((char)(i));
				}
			}catch (IOException e) {
				e.printStackTrace();
			}
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

}
