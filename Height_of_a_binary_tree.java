package practice;

public class Height_of_a_binary_tree {

	 static Node root;
	 
	    public Height_of_a_binary_tree()
	    {
	        root = null;
	    }
	
	
	int height(Node root)
    {
        if (root == null)
           return 0;
        else
        {
            /* compute  height of each subtree */
            int lheight = height(root.left);
            int rheight = height(root.right);
             
            /* use the larger one */
            if (lheight > rheight)
                return(lheight+1);
            else return(rheight+1); 
        }
    }
	
	public static void main(String[] args) {
		Height_of_a_binary_tree tree = new Height_of_a_binary_tree();
	       tree.root= new Node(1);
	       tree.root.left= new Node(2);
	       tree.root.right= new Node(3);
	       tree.root.left.left= new Node(4);
	       tree.root.left.right= new Node(5);
	       tree.root.left.right.right= new Node(5);
	       
	       System.out.println(tree.height(root));
		
	}

}
