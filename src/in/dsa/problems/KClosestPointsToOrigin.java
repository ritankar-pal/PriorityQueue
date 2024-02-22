package in.dsa.problems;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class KClosestPointsToOrigin {
	
	public ArrayList<String> closestPointsToOrigin(int[][] matrix, int k){
		
		int rows = matrix.length;
		
		PriorityQueue<Pair> pq = new PriorityQueue<>();
		ArrayList<String> list = new ArrayList<>();
		
		for(int i = 0; i < rows; i++) {
			pq.add(new Pair(matrix[i][0], matrix[i][1]));
			
			if(pq.size() > k) pq.poll();
			
		}
		
		while(!pq.isEmpty()) {
			Pair poll = pq.poll();
			list.add(poll.x + "," + poll.y);
		}
		
		return list;
	}
	
	
	//max heap:
	private class Pair implements Comparable<Pair>{
		int x;
		int y; 
		int dist;
		
		public Pair(int x, int y) {
			this.x = x;
			this.y = y;
			this.dist = (int)(Math.pow(x, 2) + Math.pow(y, 2)); 
		}

		@Override
		public int compareTo(Pair p) {
			
			if(this.dist - p.dist < 0) return 1;
			else if(this.dist - p.dist > 0) return -1;
	
			return 0;
		}
	}
	
}
