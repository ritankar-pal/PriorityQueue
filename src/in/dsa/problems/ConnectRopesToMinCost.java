package in.dsa.problems;

import java.util.PriorityQueue;

public class ConnectRopesToMinCost {
	
	public static int connectRopesToMinCost(int[] arr) {
		
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		
		for(int i = 0; i < arr.length; i++) {
			pq.add(arr[i]);
		}
		
		int cost = 0; 
		
		while(pq.size() >= 2) {
			int first = pq.poll();
			int second = pq.poll(); 
			
			cost = cost + first + second;
			pq.add(cost);	
		}
		
		return cost;
	}
}
