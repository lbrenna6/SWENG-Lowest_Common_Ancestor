import org.junit.Test;

import junit.framework.TestCase;
import static org.junit.Assert.*;

public class Lowest_Common_AncestorTest extends TestCase {
	
	 /*Tests constructor of lowest common ancestor class*/
	 @Test
	    public void testConstructor() 
	    {
		 new Lowest_Common_Ancestor();
	    
	    }
	 
	 /*Tests the (Directed Acyclic) graph is correctly constructed as a binary tree*/
	 @Test
	    public void testBinaryTreeConstructor() 
	    {
		 	Lowest_Common_Ancestor LCA = new Lowest_Common_Ancestor();
	        Lowest_Common_Ancestor.BinaryTree tree = LCA.new BinaryTree(); //create the binary tree to represent graph
	        
	        //populate the tree with some nodes 
	        tree.root = LCA.new Node(1); 
	        tree.root.left = LCA.new Node(2); 
	        tree.root.right = LCA.new Node(3); 
	        tree.root.left.left = LCA.new Node(4); 
	        tree.root.left.right = LCA.new Node(5); 
	        tree.root.right.left = LCA.new Node(6); 
	        tree.root.right.right = LCA.new Node(7);
	        assertEquals(1, tree.findLCA(5,7).data);   
	    }

	 
	    /* Tests empty tree */
	    @Test
	    public void testEmptyTree() 
	    {
	        //TODO
	    	Lowest_Common_Ancestor LCA = new Lowest_Common_Ancestor();
	        Lowest_Common_Ancestor.BinaryTree tree = LCA.new BinaryTree(); //create the binary tree to represent graph
	        assertEquals(null,tree.findLCA(1, 2));	
	    }
	    
	    /* Tests tree with one input */
	    @Test
	    public void testTreeWithOneInput() 
	    {
	        //TODO
	    	Lowest_Common_Ancestor LCA = new Lowest_Common_Ancestor();
	        Lowest_Common_Ancestor.BinaryTree tree = LCA.new BinaryTree(); //create the binary tree to represent graph
	        assertEquals(null,tree.findLCA(1, 2));	
	        tree.root = LCA.new Node(1); 
	        assertEquals(1,tree.findLCA(1, 1).data);	
	    }
	    
	    /* Tests for input of two nodes, where the LCA is the root node */
	    @Test
	    public void testLCAisRoot() 
	    {
	        //TODO
	    	Lowest_Common_Ancestor LCA = new Lowest_Common_Ancestor();
	        Lowest_Common_Ancestor.BinaryTree tree = LCA.new BinaryTree(); //create the binary tree to represent graph
	        assertEquals(null,tree.findLCA(1, 2));	
	        tree.root = LCA.new Node(1);
	        tree.root.left = LCA.new Node(2); 
	        assertEquals(1,tree.findLCA(1, 2).data);	
	    	
	    }
	    
	    /* Tests for input of two nodes, where the LCA is not the root node */
	    @Test
	    public void testLCAisNotRoot() 
	    {
	        //TODO
	    	Lowest_Common_Ancestor LCA = new Lowest_Common_Ancestor();
	        Lowest_Common_Ancestor.BinaryTree tree = LCA.new BinaryTree(); //create the binary tree to represent graph
	        
	        tree.root = LCA.new Node(1); 
	        tree.root.left = LCA.new Node(2); 
	        tree.root.right = LCA.new Node(3); 
	        tree.root.left.left = LCA.new Node(4); 
	        tree.root.left.right = LCA.new Node(5); 
	        tree.root.right.left = LCA.new Node(6); 
	        tree.root.right.right = LCA.new Node(7);
	        assertEquals(2, tree.findLCA(4,5).data);  
	    	
	    }
	    
	    /* Tests for input of two nodes, where the LCA is the first input node */
	    @Test
	    public void testLCAisNode1() 
	    {
	        //TODO
	    	Lowest_Common_Ancestor LCA = new Lowest_Common_Ancestor();
	        Lowest_Common_Ancestor.BinaryTree tree = LCA.new BinaryTree(); //create the binary tree to represent graph
	        
	        tree.root = LCA.new Node(1); 
	        tree.root.left = LCA.new Node(2); 
	        tree.root.right = LCA.new Node(3); 
	        tree.root.left.left = LCA.new Node(4); 
	        tree.root.left.right = LCA.new Node(5); 
	        tree.root.right.left = LCA.new Node(6); 
	        tree.root.right.right = LCA.new Node(7);
	        assertEquals(2, tree.findLCA(2,4).data);  
	    	
	    }
	    
	    /* Tests for input of two nodes, where the LCA is the second input node */
	    @Test
	    public void testLCAisNode2() 
	    {
	        //TODO
	    	Lowest_Common_Ancestor LCA = new Lowest_Common_Ancestor();
	        Lowest_Common_Ancestor.BinaryTree tree = LCA.new BinaryTree(); //create the binary tree to represent graph
	        
	        tree.root = LCA.new Node(1); 
	        tree.root.left = LCA.new Node(2); 
	        tree.root.right = LCA.new Node(3); 
	        tree.root.left.left = LCA.new Node(4); 
	        tree.root.left.right = LCA.new Node(5); 
	        tree.root.right.left = LCA.new Node(6); 
	        tree.root.right.right = LCA.new Node(7);
	        assertEquals(2, tree.findLCA(4,2).data);  
	    }
	    
	    /* Tests for input of two nodes that are the same node, where the LCA is the node */
	    @Test
	    public void testInputNodesSame() 
	    {
	        //TODO
	    	Lowest_Common_Ancestor LCA = new Lowest_Common_Ancestor();
	        Lowest_Common_Ancestor.BinaryTree tree = LCA.new BinaryTree(); //create the binary tree to represent graph
	        
	        tree.root = LCA.new Node(1); 
	        tree.root.left = LCA.new Node(2); 
	        tree.root.right = LCA.new Node(3); 
	        tree.root.left.left = LCA.new Node(4); 
	        tree.root.left.right = LCA.new Node(5); 
	        tree.root.right.left = LCA.new Node(6); 
	        tree.root.right.right = LCA.new Node(7);
	        assertEquals(4, tree.findLCA(4,4).data);  
	    	
	    }
	    
	    /* Tests for when node1 or node2 is not present in the tree -should return NULL as they have no LCA*/
	    @Test
	    public void testNodeNotPresent() 
	    {
	        //TODO
	    	
	    }
	    
	    /* Tests for when the nodes are negative*/
	    @Test
	    public void testNegativeNode() 
	    {
	        //TODO
	    	
	    }
	    
}
