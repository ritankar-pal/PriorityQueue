package in.dsa.problems;

public class BuildMinHeap {
	
	public static void heapify(int[] arr, int index){

		int minIndex = index;  //2 
		int leftChildIndex = (2 * minIndex) + 1; // 5
		int rightChildIndex = (2 * minIndex) + 2; //6

		if(leftChildIndex < arr.length && arr[minIndex] > arr[leftChildIndex]){
			minIndex = leftChildIndex;
		}

		if(rightChildIndex < arr.length && arr[minIndex] > arr[rightChildIndex]){
			minIndex = rightChildIndex;
		}

		if(minIndex != index){
			//swap:
			int temp = arr[index]; 
			arr[index] = arr[minIndex];
			arr[minIndex] = temp;

			heapify(arr, minIndex);
		}

	}

	public static int[] buildMinHeap(int[] arr)
	{
		// Write your code here

		int n = arr.length;

		for(int i = (n-2)/2; i >= 0; i--){
			heapify(arr, i);
		}

		return arr;

	}
}
