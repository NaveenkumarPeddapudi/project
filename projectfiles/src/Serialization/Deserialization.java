package Serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialization {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		FileInputStream fis = new FileInputStream("file.src");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Demo d = (Demo) ois.readObject();
		
		fis.close();
		ois.close();
		
		System.out.println("a-" + d.a);
		System.out.println("b-" + d.b);
	}

}
