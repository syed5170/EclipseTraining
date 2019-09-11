import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

class ReadFromFile extends Thread{
	
	public void ReadFromFile() throws IOException
	{
	try {
		FileReader fr1=new FileReader("input.txt");
		BufferedReader br1=new BufferedReader(fr1);
		String str;
		//int x;
		while((str=br1.readLine())!=null)
	System.out.println(str);
		
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
		
	}

}