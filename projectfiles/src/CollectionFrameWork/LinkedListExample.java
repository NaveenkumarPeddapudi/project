package CollectionFrameWork;

import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {
		
		LinkedList<String> data= new LinkedList<>();
		
		data.add("Naveen");
		data.add("kumar");
		data.add("peddapudi");
		
		for (String d : data) {
			System.out.println(d);
		}
		
	}

}
