package CollectionFrameWork;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {
	void test (ArrayList<Integer>data) {
		data.add(99);
		
	}

	public static void main(String[] args) {
		int [] a = new int [4];
		a[0]=7;
		a[1]=8;
		a[2]=9;
		a[3]=10;
		
		
		ArrayList<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(9);
		list.add(8);
		list.add(7);
		
		
		
		for (Integer val: list) {
			System.out.println(val);
		}
		
		new ArrayListExample().test(list);

	

	}

}
