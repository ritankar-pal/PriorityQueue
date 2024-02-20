package in.dsa.problems;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class KClosestNumbers {
	
	
	public ArrayList<Integer> kClosestNos(int[] arr, int num, int k) {
	
		PriorityQueue<Pair> pq = new PriorityQueue<>();
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int i = 0; i < arr.length; i++) {
			
			int absDiff = Math.abs(arr[i]-num);
			pq.add(new Pair(absDiff, arr[i]));
			
			if(pq.size() > k) {
				pq.poll();
			}
		}
		
		while(!pq.isEmpty()) {
			list.add(pq.poll().elem);
		}
		
		return list;
	}
	
	
	
	
	private class Pair implements Comparable<Pair> {
		
		int diff; 
		int elem;
		
		public Pair(int diff, int elem) {
			this.diff = diff;
			this.elem = elem;
		}

		//sorting in descending order based on the diff. If 2 elements have same diff then based on elem:
		@Override
		public int compareTo(Pair p) {
			//descending order:
			if(this.diff - p.diff < 0) return 1;
			else if(this.diff - p.diff > 0) return -1;
			
			//if 2 elements have same diff:
			return p.elem - this.elem;		
		}
	}
}
