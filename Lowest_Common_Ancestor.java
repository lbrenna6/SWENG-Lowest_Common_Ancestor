/**The LCA of node1 and node2 in T is the shared ancestor of n1 and n2 that is located farthest from the root.
 * The Directed Acyclic graph is represented as a binary search tree.
 * Keys in binary tree nodes don't follow any particular order.
 * @author lbrenna6
 */

// Java implementation to find lowest common ancestor of 
// n1 and n2 using one traversal of binary tree 
// It also handles cases even when n1 and n2 are not there in Tree 
	  
public class Lowest_Common_Ancestor {
	
	/* Class containing left and right child of current node and key */
	public class Node 
	{ 
	    int data; 				//data contained in node i.e. the key
	    Node left, right; 		//left and right child of node
	  
	    public Node(int item) 	//constructor
	    { 
	        data = item; 
	        left = right = null; //initially children are set to null
	    } 
	} 
	  
	public class BinaryTree 
	{ 
	    // Root of the Binary Tree 
	    Node root; 
	    boolean v1 = false;
		boolean v2 = false; 
	  
	    // This function returns pointer to LCA node of two given values n1 and n2. 
	    // v1 is set as true by this function if n1 is present.
	    // v2 is set as true by this function if n2 is present.
	    Node findLCAUtil(Node node, int n1, int n2) 
	    { 
	        // Base case 
	        if (node == null) 
	            return null; 
	          
	        //Store result in temp, in case of key match so that we can search for other key also. 
	        Node temp=null; 
	  
	        // If either n1 or n2 matches with root's key, report the presence 
	        // by setting v1 or v2 as true and return root.
	        //(Note that if a key is ancestor of other, then the ancestor key becomes LCA) 
	        if (node.data == n1) 
	        { 
	            v1 = true; 
	            temp = node; 
	        } 
	        if (node.data == n2) 
	        { 
	            v2 = true; 
	            temp = node; 
	        } 
	  
	        // Look for keys in left and right subtrees 
	        Node left_lca = findLCAUtil(node.left, n1, n2); 
	        Node right_lca = findLCAUtil(node.right, n1, n2); 
	  
	        if (temp != null) 
	            return temp; 
	  
	        // If both of the above calls return Non-NULL, then one key 
	        // is present in once subtree and other is present in other, 
	        // So this node is the LCA. 
	        if (left_lca != null && right_lca != null) 
	            return node; 
	  
	        // Otherwise check if left subtree or right subtree is LCA 
	        return (left_lca != null) ? left_lca : right_lca; 
	    } 
	  
	    // Finds lca of n1 and n2 under the subtree rooted with 'node'.
	    Node findLCA(int n1, int n2) 
	    { 
	        // Initialize n1 and n2 as not visited 
	        v1 = false; 
	        v2 = false; 
	  
	        // Find lca of n1 and n2 using the technique discussed above 
	        Node lca = findLCAUtil(root, n1, n2); 
	  
	        // Return LCA only if both n1 and n2 are present in tree 
	        if (v1 && v2) 
	            return lca; 
	  
	        // Else return NULL 
	        return null; 
	    } 
	  
	    /* Driver program to test above functions */
	    public void main(String args[]) 
	    { 
	        BinaryTree tree = new BinaryTree(); //create the binary tree to represent graph
	        
	        //populate the tree with some nodes 
	        tree.root = new Node(1); 
	        tree.root.left = new Node(2); 
	        tree.root.right = new Node(3); 
	        tree.root.left.left = new Node(4); 
	        tree.root.left.right = new Node(5); 
	        tree.root.right.left = new Node(6); 
	        tree.root.right.right = new Node(7); 
	  
	        Node lca = tree.findLCA(4, 5); 
	        if (lca != null) 
	            System.out.println("LCA(4, 5) = " + lca.data); 
	        else
	            System.out.println("Keys are not present"); 
	  
	        lca = tree.findLCA(4, 10); 
	        if (lca != null) 
	            System.out.println("LCA(4, 10) = " + lca.data); 
	        else
	            System.out.println("Keys are not present"); 
	    } 
	} 
}
