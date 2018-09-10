package webScrap.org.webScrap;

import java.util.Scanner;

public class BSTDistance {
	public static  Node root;
	public BSTDistance(){
		this.root = null;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] values = {5,6,3,1,2,4};
		int n = values.length;
		int node1 = 2;
		int node2 = 4;
		System.out.println(bstDistance(values, n, node1, node2));
		
	}
	public void display(Node root){
		if(root!=null){
			display(root.left);
			System.out.print(" " + root.data);
			display(root.right);
		}
	}
	public static int bstDistance(int[] values, int n, int node1, int node2) {
		int ans = 0;
		BSTDistance b = new BSTDistance();
			for(int i =0;i<n;i++)
			{
				b.insert(values[i]);
			}
//			b.display(b.root);
			if(find(node1) && find(node2))
			{
			int common_ancestor = getLeastCommonAncestor(b.root, node1, node2);
			int depth_of_node1 = getDepth(node1);
			int depth_of_node2 = getDepth(node2);
			int depth_of_common_ancestor = getDepth(common_ancestor);
			
//			System.out.println(getLeastCommonAncestor(b.root, 1, 6));
//			System.out.println(getDepth(1));
//			System.out.println(b.root.data);
//			int aa = getDepth(root, node1);
//			System.out.println(find(7));
//			System.out.println(depth_of_node1);
//			System.out.println(depth_of_node2);
//			System.out.println(depth_of_common_ancestor);
		return depth_of_node1 + depth_of_node2 - (2*depth_of_common_ancestor);
			}else
				return -1;
	}
	
	
//	public static int getDepth(Node curr, Node target) {
//		if (curr == null)
//			return -1;
//		if (curr == target)
//			return 0;
//		int left = getDepth(curr.left, target);
//		int right = getDepth(curr.right, target);
//		if (left == -1 && right == -1)
//			return -1;
//		return left == -1? right + 1: left + 1;
//
//	}
	
	
	class Node{
		int data;
		Node left;
		Node right;	
		public Node(int data){
			this.data = data;
			left = null;
			right = null;
		}
	}
	public void insert(int id){
		Node newNode = new Node(id);
		if(root==null){
			root = newNode;
			return;
		}
		Node current = root;
		Node parent = null;
		while(true){
			parent = current;
			if(id<current.data){				
				current = current.left;
				if(current==null){
					parent.left = newNode;
					return;
				}
			}else{
				current = current.right;
				if(current==null){
					parent.right = newNode;
					return;
				}
			}
		}
	}
	
	public static boolean find(int id) {
		Node current = root;
		System.out.println(current.data);
		while (current != null) {
			if (current.data == id) {
				return true;
			} else if (current.data > id) {
				current = current.left;
			} else {
				current = current.right;
			}
		}
		return false;
	}
	public static int getLeastCommonAncestor(Node current,int node1,int node2)
	{
		if(current ==null)
			return -1;
		if(current.data == node1 || current.data == node2)
			return current.data;
		int left = getLeastCommonAncestor(current.left, node1, node2 );
		int right = getLeastCommonAncestor(current.right, node1, node2 );
		if(left != -1 && right != -1)
			return current.data;
		return left == -1? right: left;
	}
	
	public static int getDepth(int id) {
		Node current = root;
		int ans = 0;
		while (current != null) {
			if (current.data == id) {
				return ans;
			} else if (current.data > id) {
				current = current.left;
				ans++;
			} else {
				current = current.right;
				ans++;
			}
		}
		return -1;

	}

}