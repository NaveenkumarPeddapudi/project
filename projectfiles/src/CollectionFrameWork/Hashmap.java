package CollectionFrameWork;

import java.util.HashMap;
import java.util.Set;
import java.util.Collection;

public class Hashmap {

	public static void main(String[] args) {
		
		HashMap<Integer, String> map = new HashMap<>();
		
		map.put(1,"Naveen");
		map.put(2, "Kumar");
		map.put(3,"Peddapudi");
		map.put(null, "praneeth");
		map.put(null,"Sunny");
		
		System.out.println(map.get(1));
		System.out.println(map.get(null));
		
		Set<Integer> keys =  map.keySet();
		for(Integer d : keys) {
			System.out.println(d);
		}
		Collection<String> values =map.values();
		for(String d :values) {
			System.out.println(d);
		}
	}

}
