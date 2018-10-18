package webScrap.org.webScrap;

import java.util.PriorityQueue;

public class Max_heep_practice {

	public static void main(String[] args) {
		
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		
		pq.add(10);
		pq.add(4);
		pq.add(1);
		pq.add(1);
		pq.add(1);
		pq.add(2);
		pq.add(3);
		pq.add(4);
		
		System.out.println(pq.poll());
		
	}

}
