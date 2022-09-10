import java.io.*;
import java.util.*;
class Graph
{
    private int V;
    private LinkedList<Integer> adjacent[];
    Graph(int v)
    {
        V = v;
        adjacent = new LinkedList[v];
        for (int i=0; i<v; ++i)
            adjacent[i] = new LinkedList();
    }
    void addEdge(int v,int w)
    {
        adjacent[v].add(w);
    }
    void BFS(int s)
    {
        boolean visited[] = new boolean[V];
        LinkedList<Integer> queue = new LinkedList<Integer>();
        visited[s]=true;
        queue.add(s);
        while (queue.size() != 0)
        {
            s = queue.poll();
            System.out.print(s+" ");
            Iterator<Integer> i = adjacent[s].listIterator();
            while (i.hasNext())
            {
                int n = i.next();
                if (!visited[n])
                {
                    visited[n] = true;
                    queue.add(n);
                }
            }
        }
    }
    public static void main(String args[])
    {
        Graph g = new Graph(4);
        g.addEdge(0, 2);
        g.addEdge(0, 1);
        g.addEdge(1, 3);
        g.addEdge(2, 1);
        g.addEdge(2, 3);
        g.addEdge(3, 3);
        System.out.println("The Breadth First Traversal is: ");
        g.BFS(1);
    }
}
