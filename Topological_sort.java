import java.util.* ;
import java.io.*; 
public class Solution 
{
    public static ArrayList<Integer> topologicalSort(ArrayList<ArrayList<Integer>> edges, int v, int e) 
    {
        // Write your code here

        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();
        for(int i = 0;i<v;i++){
            adj.add(new ArrayList<>());
        }
        for(ArrayList<Integer> edge :edges){
            int x = edge.get(0);
            int y = edge.get(1);
            adj.get(x).add(y); // directed graph
        }
        boolean[] vis = new boolean[v];
        Stack<Integer> st = new Stack<Integer>(); 
        for(int i = 0;i<v;i++){
            if(!vis[i]){
                dfs(adj,st,vis,i);
            }
        }
        ArrayList<Integer> ans = new ArrayList<>();
        while(!st.isEmpty()){
            ans.add(st.pop());
        }
        return ans;
    }
    public static void dfs(ArrayList<ArrayList<Integer>> adj,Stack<Integer> st, boolean[] vis,int i ){
        vis[i] = true;
        for(Integer I : adj.get(i)){
            if(!vis[I]){
                dfs(adj,st,vis,I);
            }
        }
        st.push(i);
    }
}
