package in.dsa.problems;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Map.Entry;



public class FrequencySort {
	
	public ArrayList<Integer> sortByFreq(int[] arr){
		
		HashMap<Integer, Integer> map = new HashMap<>();
		PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>(new MyComparator());
		
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int i = 0; i < arr.length; i++) {
			if(map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i])+1);
			}
			else map.put(arr[i], 1);
		}
		
		for (Map.Entry<Integer, Integer> e : map.entrySet()) {
			pq.add(e);
		}
		
		while(!pq.isEmpty()) {
			Entry<Integer, Integer> entry = pq.poll();
			Integer value = entry.getValue();
			while(value != 0) {
				list.add(entry.getKey());
				value--;
			}
		}
		
		return list;
	}
	
	private class MyComparator implements Comparator<Entry<Integer, Integer>>{

		@Override
		public int compare(Entry<Integer, Integer> o1, Entry<Integer, Integer> o2) {
			
			if(o1.getValue() - o2.getValue() < 0) return 1;
			else if(o1.getValue() - o2.getValue() > 0) return -1;
			
			return o1.getKey().compareTo(o2.getKey());
			
		}
		
	}
}





