import java.util.*;


public class CycleDetectionDirectedGraph {
    
    public static String cycleDetection(int[][] edges, int n, int m) {
        // Write your code here.
        // created adjacent list 
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i <=n; i++)
            adj.add(new ArrayList<Integer>());
        // ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            adj.get(edges[i][0]).add(edges[i][1]);
            adj.get(edges[i][1]).add(edges[i][0]);
        }
        boolean[] visited = new boolean[n+1];
        for(int i = 1;i<=n;i++){
            if(!visited[i]){
                if(dfs(visited,adj,i,-1))
                    return "Yes";
            }

        }
        // System.out.println(adj);
        return "No";
    }
    public static boolean dfs (boolean[] vis,ArrayList<ArrayList<Integer>> adj,int node,int parent){
        vis[node] = true;
        for(Integer i: adj.get(node)){
            if(!vis[i]){
                if(dfs(vis,adj,i,node))
                return true;
            }
            else if(i != parent) return true;
        }
        return false;
    }
    
}