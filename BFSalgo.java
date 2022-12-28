/*  12/28/2022 Java algo exp
BFS: an algorithm used to search or traverse a graph/tree data structures. 
It starts at the root node, and checks out the neighbour nodes first before
going down to the next-level neighbours
Applications: garbo collection, Cheney's algo
test a graph for bipartiteness
find the shortest path between 2 nodes u and v, with path length measured by the total # of edges
minimum spanning tree for an unweighted graph
web crawler
finding nodes in any connected component of a graph
ford-fulkerson method for computing the maximum flow in a flow network
serialisation/deserialisation of a binary tree vs serialisation in sorted order allows the tree to be reconstructed efficiently
*/
import java.util.*;
//a class to store a graph's edge
class Edge{
    //init the vertex and the other vertex
    int source, dest;

    //constructor
    public Edge(int source, int dest){
        //the global variable source is assigned to the paramater source of the constructor
        this.source = source;
        this.dest = dest;
    }
}

//a class to represent a graph object
//a graph can also be represented as a list of edges
class Graph{

    //a list of lists to represent an adjacency list
    List<List<Integer>> adjList = null;

    //Constructor
    Graph(List<Edge> edges, int n){
        adjList = new ArrayList<>();


        
        for (int i = 0; i < n; i++){
            adjList.add(new ArrayList<>());
        }

        //add edges to the undirected graph
        for(Edge edge: edges){
            int src = edge.source;
            int dest = edge.dest;

            adjList.get(src).add(dest);
            adjList.get(dest).add(src);
        }

    }
}

class BFSalgo{
    //perform BFS on the graph starting from vertex 'v'
    public static void BFS(Graph graph, int v, boolean[] discovered) {
        //create a queue for doing BFS
        Queue<Integer> q = new ArrayDeque<>();

        //mark the source vertex as discovered
        discovered[v] = true;

        //enqueue source vertex
        q.add(v);

        //loop til queue is empty
        while(!q.isEmpty()){
            //dequeue front node and print it
            v = q.poll();
            System.out.print(v + " ");
            
            //do for every edge(v,u)
            for(int u: graph.adjList.get(v)){
                if(!discovered[u]){
                    //mark it as discovered and enqueue it
                    discovered[u] = true;
                    q.add(u);
                }
            }
        }
    }

    public static void main(String[] args){
        //List of graph edges as per the above program
        List<Edge> edges = Arrays.asList(
            new Edge(1, 2), new Edge(1, 3), new Edge(1, 4), new Edge(2, 5),
            new Edge(2, 6), new Edge(5, 9), new Edge(5, 10), new Edge(4, 7),
            new Edge(4, 8), new Edge(7, 11), new Edge(7, 12) 
            //vertex 0,13,14 are single nodes
        );

        //total number of nodes in the graph (labelled from 0 to 14)
        int n = 15;

        //build a graph from the given edges
        Graph graph = new Graph(edges, n);

        //to keep track of whether a vertex is discovered or not
        boolean[] discovered = new boolean[n];

        //perform BFS traversal from all undiscovered nodes to
        //cover all connected components of a graph
        for (int i = 0; i < n; i++){
            if(discovered[i] == false){
                //start BFS traversal from vertex 'i'
                BFS(graph,i,discovered);
            }
        }
    }
    
}
