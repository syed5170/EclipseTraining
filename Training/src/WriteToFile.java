import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

class WriteToFile extends Thread{
	public void fileWriteMethod()
	{
	try {
		FileWriter fw1=new FileWriter("input.txt");
		BufferedWriter fw=new BufferedWriter(fw1);
		for(int i=1;i<=10;i++) {
		fw.write("Hello this is line 1..."+ i +"times" );
	try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println("Finished file writing process..");
	fw.write(" ");
		}
		fw.close();
	}catch (IOException e) {
		// TODO Auto-generated catch block
		//e.printStackTrace();
	System.out.println("Error writing to file.."+e);
	}	
		
	}
	
}

