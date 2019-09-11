package abc;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class FileWriterClass {

	public static void main(String args[]) {
		InputStreamReader in = new InputStreamReader(System.in);
		String s=null;
		try {
		FileWriter fileWriter = new FileWriter("temp.txt");
		BufferedWriter bw = new BufferedWriter(fileWriter);
		BufferedReader br = new BufferedReader(in);
		s = br.readLine();
		bw.write(s);
		bw.newLine();
		bw.write("Have a Great Day!!");
		bw.newLine();
		bw.write("Welcome,");
		bw.write("to my World!!");
		bw.newLine();
		bw.append("Appending");
		bw.close();
		}
		catch(IOException e) {
			System.out.println(e);
		}
		System.out.println("Done!");
	}
}
