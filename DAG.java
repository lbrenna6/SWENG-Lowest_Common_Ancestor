import java.util.*;

/*
 * public class Directed Acyclic Graph (DAG)
 * A graph in which node edges are directed and cannot form cycles, so you cannot
 * get back to a node by traversing it's edges.
 * 
 * FUNCTIONS:
 * 
 * Digraph(int V): create an empty digraph with V vertices
 *  
 * void addEdge(int v, int w) : Add a directed edge v->w
 * 
 * Iterable<Integer> adj(int v) : Return vertices pointing from v
 * 
 * int V() : number of vertices
 * 
 * boolean hasPth : if path exists between two nodes returns true
 * 
 * String toString() : string representation of the graph
 * 
 */

public class DAG {

	private final int V;
	private final ArrayList<Integer>[] adj;
	private final ArrayList<Integer>[] reverseAdj;			//Need for finding the LCA

	//DAG constructor
	public DAG(int V)
	{
		this.V = V;
		adj = (ArrayList<Integer>[]) new ArrayList[V];
		
		
		//Make an array list for each vertex 
		for (int v = 0; v < V; v++)
		{
			adj[v] = new ArrayList<Integer>();	
		}
	}
	
	//Adds an edge from vertex v to vertex w if conditions met, returns true if edge was successfully added
	public boolean addEdge(int v, int w)
	{
		
	}

	//Returns number of vertexes in the DAG
	public int V()
	{
		
	}

	//Returns list of vertices pointing from the vertex v 
	public ArrayList<Integer> adj(int v)
	{ 
		
	}


	//Checks if a path exists between to nodes by using depth first search
	public boolean hasPath(int x, int y)
	{
		
	}
}