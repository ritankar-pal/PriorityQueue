package in.dsa.problems;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.PriorityQueue;


public class TestApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		PriorityQueue<Employee> pq = new PriorityQueue<>();
//		
//		pq.add(new Employee(5, 2));
//		pq.add(new Employee(6, 1));
//		pq.add(new Employee(7, 0));
//		pq.add(new Employee(8, 1));
//		pq.add(new Employee(9, 2));
//		
//		while (!pq.isEmpty()) {
//			System.out.println(pq.poll());
//		}
		
		
//		TopKFrequentElements elem = new TopKFrequentElements();
//		
//		int[] arr = new int[] {1,1,3,3,3,2,2,2,4};
//		ArrayList<Integer> list = elem.topKFreqElem(arr, 2);
//		list.forEach(System.out::println);
		
		
		FrequencySort fs = new FrequencySort();
		
		int[] arr = new int[] {1,1,1,2,2,3,3,4,4};
		ArrayList<Integer> list = fs.sortByFreq(arr);
		
		for (Integer i : list) {
			System.out.print(i + " ");
		}
	}

}
