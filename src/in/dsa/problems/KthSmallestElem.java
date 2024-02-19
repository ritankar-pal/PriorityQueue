package in.dsa.problems;

import java.util.PriorityQueue;


public class KthSmallestElem {
	
	public static int kthSmallestElement(int[] arr, int k) {
		
		//create a max Heap:
		PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> b-a);
		
        for(int i = 0; i < arr.length; i++){
            pq.add(arr[i]);
            
            if(pq.size() > k){
                pq.poll();
            }
        }
        
        return pq.peek();
	}
}
