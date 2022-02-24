package CollectionFrameWork;

import java.util.Collection;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapWExample {
	

		public static void main(String[] args) {
			TreeMap<String,String > treemap =new TreeMap<>();
			
			
			treemap.put("second", "Kumar");
			treemap.put("third", "Peddapudi");
			treemap.put("first" , "Naveen");
			
			Set<String> keys = treemap.keySet();
			for (String key : keys) {
				System.out.println(key);
				
			}
			Collection<String> vals = treemap.values();
			for (String val : vals) {
				System.out.println(val);
			}
			

		}





}
