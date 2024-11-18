
import java.util.ArrayList;
import java.util.Scanner;

public class createGraph {
  static class Edge{
    int src;
    int dest;
    int wt;
    Edge(int s,int d,int w)
    {
      this.src = s;
      this.dest = d;
      this.wt = w;
    }
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number of vertex");
    int V = sc.nextInt();
    ArrayList<Edge>[] graph = new ArrayList[V];
    for(int i=0;i<V;i++){
      graph[i] = new ArrayList<>();
    }
    graph[0].add(new Edge(0,1,4));

    graph[1].add(new Edge(1,0,4));
    graph[1].add(new Edge(1,2,1));
    graph[1].add(new Edge(1,3,3));
    
    
    graph[2].add(new Edge(2,1,1));
    graph[2].add(new Edge(2,3,1));
    graph[2].add(new Edge(2,4,4));
    
    graph[3].add(new Edge(3,1,3));
    graph[3].add(new Edge(3,2,1));
    
    graph[4].add(new Edge(4,2,4));
    
    for(int j =0;j<graph.length;j++){
      System.out.print("Node "+ j +" neighbours are: ");
    for(int i=0;i<graph[j].size();i++){
      Edge e = graph[j].get(i);
      System.out.print(" " + e.dest);
    }
  System.out.println();  
  }
   }
}
