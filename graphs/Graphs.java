package graphs;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Graphs {
    static LinkedList<Integer> adj[];
    
    public Graphs(int v) {
    	adj=new LinkedList[v];
    	for(int i=0;i<v;i++) {
    		adj[i]=new LinkedList<Integer>();
    	}
    }
    
    public void addEdge(int source, int destination) {
    	adj[source].add(destination);
    	adj[destination].add(source);
    }
    static public boolean DFS(int source, int destination) {
    	boolean [] vis=new boolean[adj.length];
    	vis[source]=true;
    	
    	Stack<Integer> stack=new Stack<>();
    	stack.push(source);
    	
    	while(!stack.isEmpty()) {
    		int cur=stack.pop();
    		
    		if(cur==destination)return true;
    		
    		for(int neighbour: adj[cur]) {
    			if(!vis[neighbour]) {
    				vis[neighbour]=true;
    				stack.push(neighbour);
    				
    			}
    		}
    	}
    	return false;
    }
    static public int BFS(int source, int destination) {
    	boolean [] vis=new boolean[adj.length];
    	int[] parent= new int[adj.length];
    	
    	Queue<Integer> q=new LinkedList<>();
    	
    	q.add(source);
    	parent[source]=-1;
    	vis[source]=true;
    	
    	while(!q.isEmpty()) {
    		int cur=q.poll();
    		if(cur==destination)break;
    		
    		for(int neighbour: adj[source]) {
    			if(!vis[neighbour]) {
    				vis[neighbour]=true;
    				q.add(neighbour);
    				parent[neighbour]=cur;
    			}
    		}
    	}
    	
    	int cur=destination;
    	int distance=0;
    	while(parent[cur]!=-1) {
    		System.out.print(cur+" -> ");
    		cur=parent[cur];
    		distance++;
    	}
    	System.out.print(cur);
    	System.out.println();
    	return distance;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      
      System.out.println("Enter the number of vertices and edges");
      
      int v=sc.nextInt();
      int e=sc.nextInt();
      
      Graphs graph=new Graphs(v);
      
     System.out.println("Enter "+ e + "edges");
     for(int i=0;i<e;i++) {
    	 int source=sc.nextInt();
    	 int destination=sc.nextInt();
    	 
    	 graph.addEdge(source,destination);
     }
     
    int a= BFS(2,4);
   System.out.println("min dist is: "+ a); 
	}

}
