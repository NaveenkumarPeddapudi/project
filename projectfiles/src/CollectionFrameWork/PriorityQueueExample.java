package CollectionFrameWork;

import java.util.PriorityQueue;

public class PriorityQueueExample {

	public static void main(String[] args) {
		PriorityQueue<String>data= new PriorityQueue();
		data.add("peddapudi");
		data.add("naveen");
		data.add("kumar");
		
		System.out.println(data.element());
		System.out.println(data.peek());
		System.out.println(data.poll());
		System.out.println(data.remove());
		System.out.println(data.remove());
	}
	

}
