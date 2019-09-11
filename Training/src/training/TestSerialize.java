package training;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestSerialize {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		Book book1=new Book(102,"The Complete Reference","Herber Shield", 1000);
		
		try {
			//Serialize the Object
			FileOutputStream fos = new FileOutputStream("Book.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(book1);
			System.out.println("Book is Successfully Serialized");
			FileInputStream fis = new FileInputStream("Book.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			Book mybook = (Book) ois.readObject();
			System.out.println("Book is Successfully retrieved from Serialized Object");
			System.out.println("After Serialization ..." + mybook);
			
			//Desereialize the Object
			
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}

	}

}
