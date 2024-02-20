package in.dsa.problems;

class Node{
	int data;
	Node left,right;
	Node(int d){
		data=d;
		left=right=null;
	}
}


public class IsBinaryTreeAHeap {

	private int count(Node root)
	{
		if(root == null) return 0; 

		if(root.left == null && root.right == null) return 1;

		return 1 + count(root.left) + count(root.right);

	}


	private boolean isCBT(Node root, int index, int totalNodes){

		if(root == null) return true; 

		if(index >= totalNodes) return false;

		if(root.left == null && root.right == null) return true;

		boolean left = isCBT(root.left, 2*index+1, totalNodes);
		if(!left) return false;

		boolean right = isCBT(root.right, 2*index+2, totalNodes);

		return (left && right);
	}


	private boolean isMaxHeap(Node root){

		if(root == null) return true; 

		if(root.left == null && root.right == null) return true; 

		if(root.right == null){
			return (root.data > root.left.data);   
		}

		boolean left = isMaxHeap(root.left);
		boolean right = isMaxHeap(root.right);

		return (left && right && root.data > root.left.data && root.data > root.right.data);

	}


	boolean isHeap(Node root) {
		// code here
		int countNodes = count(root);

		if(isCBT(root, 0, countNodes) && isMaxHeap(root)){
			return true;
		}

		return false;

	}
}
