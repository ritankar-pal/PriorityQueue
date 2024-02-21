package in.dsa.problems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class TopKFrequentElements {

	public ArrayList<Integer> topKFreqElem(int[] arr, int k){
		
		if(k > arr.length) return null;
		
		
		HashMap<Integer, Integer> map = new HashMap<>();
		ArrayList<Integer> list = new ArrayList<>();
		
		//storing the freq of the numbers in map:
		for(int i = 0; i < arr.length; i++) {
			if(map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i]) + 1);
			}
			else map.put(arr[i], 1);
		}
		
		//Iterating over map and storing it int the Priority Queue: minHeap
		PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>((a,b) -> a.getValue() - b.getValue());
		
		for(Map.Entry<Integer, Integer> e: map.entrySet()) {
			pq.add(e);
			
			if(pq.size() > k) {
				pq.poll();
			}
		}
		
		while(!pq.isEmpty()) {
			list.add(pq.poll().getKey());
		}
		
		
		return list;
	}
	
}
