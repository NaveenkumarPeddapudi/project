package CollectionFrameWork;


import java.util.HashSet;

public class HashSetExample {

	public static void main(String[] args) {
		
		HashSet<String> data = new HashSet();
		
		data.add("Naveen");
		data.add("Kumar");
		data.add("Peddapudi");
		data.add(null);
		data.add("Sunny");
		
		
		for(String d : data) {
			System.out.println(d);
		}
		
	}

}
