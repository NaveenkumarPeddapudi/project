package CollectionFrameWork;

import java.util.LinkedHashMap;
import java.util.Set;

public class LinkedHashMapExample {

	public static void main(String[] args) {
		LinkedHashMap<String,String > linkedHashMap =new LinkedHashMap<>();
		
		linkedHashMap.put("first" , "Naveen");
		linkedHashMap.put("second", "Kumar");
		linkedHashMap.put("third", "Peddapudi");
		
		Set<String> keys = linkedHashMap.keySet();
		for (String key : keys) {
			System.out.println(key);
			
		}
		

	}

}
