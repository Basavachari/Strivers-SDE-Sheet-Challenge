import java.util.*;

public class Check_Bipartite_Graph {
    static boolean dfs(ArrayList<ArrayList<Integer>> adj, int node ,int col ,int[] color){
        color[node] = col;
        for(int i : adj.get(node)){
            if(color[i] == -1){
                if(!dfs(adj , i , 1-col ,color)) return false;
            }
            else if(color[i] == col ) return false;
        }
        return true;
    }

    public static boolean isGraphBirpatite(ArrayList<ArrayList<Integer>> edges) {

        // Write your code here
        ArrayList<ArrayList<Integer>> adj=new ArrayList<ArrayList<Integer>>();
        int n=edges.size();
        
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<Integer>());
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(edges.get(i).get(j)==1 & i!=j){
                    adj.get(i).add(j);
                    adj.get(j).add(i);

                }
            }
        }

        int[] color = new int[n];
        Arrays.fill(color, -1);
        for(int i =0;i<n;i++){
            if(color[i] == -1){
                if(!dfs(adj,i,0,color)) return false;
            }
        }
        return true;
    }
}