package in.dsa.problems;

import java.util.PriorityQueue;

public class SumOfElemBetweenK1andK2Smallest {
	
	
	public int kthSmallest(int[] arr, int k) {
		
		PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> b - a); //maxHeap
		
		for(int i = 0; i < arr.length; i++) {
			pq.add(arr[i]); 
			
			if(pq.size() > k) pq.poll();
		}
		
		return pq.peek(); 
	}
	
	
	public int sumBetweenK1AndK2Smallest(int[] arr, int k1, int k2) {
		
		int first = kthSmallest(arr, k1);
		int second = kthSmallest(arr, k2);
		
		int sum = 0;
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > first && arr[i] < second) sum = sum + arr[i];
		}
		
		return sum;
	}
}
