package Serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
 
class Demo implements Serializable{
	public int a;
	public String b;
	public Demo(int a, String b) {
		this.a=a;
		this.b=b;
	}
}

public class Serializationexample {

	public static void main(String[] args) throws IOException {
			Demo d = new Demo(4,"Naveen");
			
			FileOutputStream fos = new FileOutputStream("file.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			oos.writeObject(d);
			
			oos.close();
			fos.close();
			
			System.out.println("object has been Serialied successfully");
			

	}

}
