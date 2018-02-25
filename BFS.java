/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Graph{
    private int V;
    private LinkedList<Integer> adj[];
    Graph(int v){
        V=v;
        adj=new LinkedList[V];
        for(int i=0;i<v;i++){
            adj[i]=new LinkedList();
        }
    }
    void addEdge(int v, int u){
        adj[v].add(u);
    }
    void BFS(int s){
        LinkedList<Integer> queue= new LinkedList<Integer>();
        boolean visited[]=new boolean[V];
        visited[s]=true;
        queue.add(s);
        /*for(int j=0;j<V;j++){
         System.out.println(adj[j]);
         }*/
        while(queue.size()!=0){
            int top=queue.poll();
            System.out.println(top);
            Iterator<Integer> i= adj[top].listIterator();
            
            while(i.hasNext()){
                
                int n=i.next();
                if(visited[n]==false){
                    
                    visited[n]=true;
                    queue.add(n);
                }
            }
        }
    }
    public static void main (String[] args) throws java.lang.Exception{
        int vrtces;
        
        Graph g=new Graph(4);
        g.addEdge(0,1);
        g.addEdge(0,2);
        g.addEdge(1,2);
        g.addEdge(2,0);
        g.addEdge(2,3);
        g.addEdge(3,3);
        g.BFS(2);
    }
}