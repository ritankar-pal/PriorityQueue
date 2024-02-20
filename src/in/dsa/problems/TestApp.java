package in.dsa.problems;

import java.util.PriorityQueue;


public class TestApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PriorityQueue<Employee> pq = new PriorityQueue<>();
		
		pq.add(new Employee(5, 2));
		pq.add(new Employee(6, 1));
		pq.add(new Employee(7, 0));
		pq.add(new Employee(8, 1));
		pq.add(new Employee(9, 2));
		
		while (!pq.isEmpty()) {
			System.out.println(pq.poll());
		}
		
	}

}
