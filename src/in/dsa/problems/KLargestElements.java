package in.dsa.problems;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class KLargestElements {
	
	public static ArrayList<Integer> kLargestElem(int[] arr, int k) {
		
		//minHeap
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int i = 0; i < arr.length; i++) {
			pq.add(arr[i]);
			
			if(pq.size() > k) {
				pq.poll();
			}
		}
		
		while(!pq.isEmpty()) {
			list.add(pq.poll());
		}
		
		return list;
	}
}
