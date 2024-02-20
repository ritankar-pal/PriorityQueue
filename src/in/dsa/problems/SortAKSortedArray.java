package in.dsa.problems;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class SortAKSortedArray {
	
	public ArrayList<Integer> sortKSortedArray(int[] arr, int k){
		
		//create a minHeap:
		PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> a-b);
		
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int i = 0; i < arr.length; i++) {
			pq.add(arr[i]); 
			
			if(pq.size() > k) {
				list.add(pq.poll());
			}
		}
		
		while(!pq.isEmpty()) {
			list.add(pq.poll());
		}
		
		return list;
	}
}
