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
	 
	 /*Tests the graph is correctly constructed as a binary tree*/
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
	    	Lowest_Common_Ancestor LCA = new Lowest_Common_Ancestor();
	        Lowest_Common_Ancestor.BinaryTree tree = LCA.new BinaryTree(); //create the binary tree to represent graph
	        
	        tree.root = LCA.new Node(1); 
	        tree.root.left = LCA.new Node(2); 
	        tree.root.right = LCA.new Node(3); 
	        tree.root.left.left = LCA.new Node(4); 
	        tree.root.left.right = LCA.new Node(5); 
	        tree.root.right.left = LCA.new Node(6); 
	        tree.root.right.right = LCA.new Node(7);
	        assertEquals(null, tree.findLCA(100,200));	
	    }
	    
	    /* Tests for when the nodes are negative*/
	    @Test
	    public void testNegativeNode() 
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
	        assertEquals(null, tree.findLCA(-1,-2));
	    	
	    }
	    
	    
	    /* Tests for when tree only has nodes coming from left*/
	    @Test
	    public void testNodesInStraightLineToLeft() 
	    {
	        //TODO
	    	Lowest_Common_Ancestor LCA = new Lowest_Common_Ancestor();
	        Lowest_Common_Ancestor.BinaryTree tree = LCA.new BinaryTree(); //create the binary tree to represent graph
	        
	        tree.root = LCA.new Node(1); 
	        tree.root.left = LCA.new Node(2); 
	        tree.root.left.left = LCA.new Node(3);  
	        tree.root.left.left.left = LCA.new Node(4); 
	        assertEquals(2, tree.findLCA(3,2).data);
	    }
	    
	    /* Tests for when tree only has nodes coming from right*/
	    @Test
	    public void testNodesInStraightLineToRight() 
	    {
	        //TODO
	    	Lowest_Common_Ancestor LCA = new Lowest_Common_Ancestor();
	        Lowest_Common_Ancestor.BinaryTree tree = LCA.new BinaryTree(); //create the binary tree to represent graph
	        
	        tree.root = LCA.new Node(1); 
	        tree.root.right = LCA.new Node(2); 
	        tree.root.right.right = LCA.new Node(3);  
	        tree.root.right.right.right = LCA.new Node(4); 
	        assertEquals(2, tree.findLCA(3,2).data);
	    }
	    
	    /* Tests for when the nodes are negative*/
	    @Test
	    public void testNegativeNodeTree() 
	    {
	        //TODO
	    	Lowest_Common_Ancestor LCA = new Lowest_Common_Ancestor();
	        Lowest_Common_Ancestor.BinaryTree tree = LCA.new BinaryTree(); //create the binary tree to represent graph
	        
	        tree.root = LCA.new Node(-1); 
	        tree.root.left = LCA.new Node(-2); 
	        tree.root.right = LCA.new Node(-3); 
	        tree.root.left.left = LCA.new Node(-4); 
	        tree.root.left.right = LCA.new Node(-5); 
	        tree.root.right.left = LCA.new Node(-6); 
	        tree.root.right.right = LCA.new Node(-7);
	        assertEquals(-2, tree.findLCA(-5,-4).data);   	
	    }
	    
	    /**TESTS FOR DIRECTED ACYCLIC GRAPH DATA STRUCTURE**/
	    //tests adding edges to the DAG
		 @Test
			public void testAddEdge(){
				DAG dag = new DAG(5);
				
				assertEquals("Adding a valid edge failed", true, dag.addEdge(0, 1));
				assertEquals("Adding a  valid edge failed", true, dag.addEdge(1, 2));
				assertEquals("Adding an edge from node to itself should return false", false, dag.addEdge(0, 0));
				assertEquals("Adding a cycle test failed", false, dag.addEdge(2, 0));
				
				assertEquals("Test for non existent vertices failed", false, dag.addEdge(5, 4));
				assertEquals("Test for non existent vertices failed", false, dag.addEdge(100, 200));
				assertEquals("Test for negative vertices failed", false, dag.addEdge(-1, -2));
				
			}
			
		 
			/*@Test
			public void testV(){
				//Not much to test - should return the num of vertices.
				dag dag1 = new dag(5);
				assertEquals("Testing V()", 5, dag1.V());
			}
			
			@Test
			public void testAdj(){
				dag dag1 = new dag(5);
				
				assertTrue("Testing empty adj list", dag1.adj(0).isEmpty());
				
				ArrayList<Integer> expectedResult = new ArrayList<Integer>();
				
				//Testing single edge adj list
				expectedResult.add(2);
				dag1.addEdge(1, 2);
				
				assertTrue("Testing single edge adj list", dag1.adj(1).size() == expectedResult.size());
				for(int i : expectedResult){
					assertTrue("Testing single edge adj list", dag1.adj(1).contains(i));
				}
				
				expectedResult.clear();
				
				expectedResult.add(3);
				expectedResult.add(4);
				
				dag1.addEdge(2, 3);
				dag1.addEdge(2, 4);
				
				assertTrue("Testing multi-edge adj list", dag1.adj(2).size() == expectedResult.size());
				for(int i : expectedResult){
					assertTrue("Testing multi-edge adj list", dag1.adj(2).contains(i));
				}
			}
			
//			@Test
			public void testDagLowestCommonAncestor(){
				dag testDag1 = new dag(5);
				
				testDag1.addEdge(0, 1);
				testDag1.addEdge(0, 2);
				testDag1.addEdge(2, 3);
				testDag1.addEdge(3, 4);
				
				ArrayList<Integer> expectedResult = new ArrayList<Integer>();
				expectedResult.add(0);
						
				assertTrue("Testing single lca return", testDag1.lowestCommonAncestor(4,1).size() == expectedResult.size());
				for(int i : expectedResult){
					assertTrue("Testing single lca return", testDag1.lowestCommonAncestor(4,1).contains(i));
				}
				
				
				
				
				
				dag testDag2 = new dag(7);

				testDag2.addEdge(0, 3);			
				testDag2.addEdge(1, 3);
				testDag2.addEdge(1, 4);
				testDag2.addEdge(2, 5);
				testDag2.addEdge(2, 6);
				testDag2.addEdge(3, 5);
				testDag2.addEdge(3, 6);
				testDag2.addEdge(4, 6);
				
				expectedResult.clear();
				expectedResult.add(2);
				expectedResult.add(3);
						
				assertTrue("Testing mutliple lca return", testDag1.lowestCommonAncestor(5,6).size() == expectedResult.size());
				for(int i : expectedResult){
					assertTrue("Testing mutliple lca return", testDag1.lowestCommonAncestor(5,6).contains(i));
				}
						
				//Testing non present vertices input
				assertTrue("Testing negative input", testDag2.lowestCommonAncestor(-2, -1).isEmpty());
				
				assertTrue("Testing out of range input", testDag2.lowestCommonAncestor(2457, 987).isEmpty());		
			*/
}
