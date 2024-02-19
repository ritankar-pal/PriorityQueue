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
	
	public T removeMin() {
		
		if(isEmpty()) return null;
		
		Element<T> minElem = heap.get(0);
		
		Element<T> lastElem = heap.get(heap.size()-1);
		
		//replacing the first elem with the lastelem of the ArrayList:
		heap.set(0, lastElem);
		
		//removing the last element:
		heap.remove(heap.size()-1);
		
		int parentIndex = 0;
		int leftChildIndex = (2*parentIndex) + 1;
		int rightChildIndex = (2*parentIndex) + 2;
		
		while(leftChildIndex < heap.size()) {
			
			int minIndex = parentIndex;
			
			if(heap.get(minIndex).priority > heap.get(leftChildIndex).priority) {
				minIndex = leftChildIndex;
			}
			
			if(rightChildIndex < heap.size() &&  heap.get(minIndex).priority > heap.get(rightChildIndex).priority) {
				minIndex = rightChildIndex;
			}
			
			if(minIndex == parentIndex) return minElem.value;
			
			Element<T> temp = heap.get(parentIndex);
			heap.set(parentIndex, heap.get(minIndex));
			heap.set(minIndex, temp);
			
			parentIndex = minIndex;
			leftChildIndex = (2*parentIndex) + 1;
			rightChildIndex = (2*parentIndex) + 2;
		}
		return minElem.value;
	}
	
	//returns null if the heap is empty:
	public T getMin() {
		if(isEmpty()) return null;
		return heap.get(0).value;
	}
	
	
	public boolean isEmpty() {
		if(size() == 0) return true;
		return false;
	}
	
}
