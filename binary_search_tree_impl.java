package practice;

class Node {
	int data;
	Node left;
	Node right;

	Node(int data) {
		this.data = data;
		left = right = null;
	}
}

public class binary_search_tree_impl {

	public static Node insert(Node root, int data) {
		if (root == null)
			return new Node(data);
		else {
			Node cur;
			if (data <= root.data) {
				cur = insert(root.left, data);
				root.left = cur;
			} else {
				cur = insert(root.right, data);
				root.right = cur;
			}
			return root;
		}
	}
	
	


	public static void main(String[] args) {

		int data[] = { 4, 2, 1, 3, 8, 9 };
		Node root = null;
		for (int i = 0; i < data.length; i++) {
			insert(root, data[i]);
		}

	}

}
