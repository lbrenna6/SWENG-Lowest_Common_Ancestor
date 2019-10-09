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
 * int E() : number of edges
 *  
 * String toString() : string representation of the graph
 * 
 */

public class DAG {

	private final int V;
	private final ArrayList<Integer>[] adj;
	
	// For LCA
	private final ArrayList<Integer>[] reverseAdj;
}