package in.dsa.cn;
import java.util.ArrayList;

//minHeap:
public class Priority_Queue<T> {
	
	private ArrayList<Element<T>> heap;
	
	public Priority_Queue() {
		this.heap = new ArrayList<>();
	}
	
	public int size() {
		return heap.size();
	}
	
	public void insert(T value, int priority) {
		
		Element<T> element = new Element<>(value, priority);
		
		//first we will add the element in the ArrayList and then we will re-heap as per the priority:
		heap.add(element);
		
		//now we will compare the priority and if its less swap with the parent:
		int childIndex = heap.size() - 1;
		int parentIndex = (childIndex - 1) / 2;
		
		while(childIndex > 0) {			
			
			if(heap.get(childIndex).priority < heap.get(parentIndex).priority) {
				Element<T> temp =  heap.get(childIndex);
				heap.set(childIndex, heap.get(parentIndex));
				heap.set(parentIndex, temp);
				
				childIndex = parentIndex;
				parentIndex = (childIndex - 1) / 2;
			}
			else return;
		}
		
	}
	
	//returns null if the heap is empty:
	public T getMin() {
		if(isEmpty()) return null;
		return heap.get(0).value;
	}
	
	public T removeMin() {
		return null;
	}
	
	public boolean isEmpty() {
		if(size() == 0) return true;
		return false;
	}
	
}
