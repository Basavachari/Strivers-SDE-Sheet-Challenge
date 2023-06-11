import java.util.* ;
import java.io.*; 
public class BFS {
	public static ArrayList<Integer> BFS(int vertex, int edges[][]){
		// WRITE YOUR CODE HERE
		List<List<Integer>> adj = new ArrayList<>();
		for (int i = 0; i < vertex; i++) {
			adj.add(new ArrayList<Integer>());
		}
		for (int i = 0; i < edges[0].length; i++) {
			adj.get(edges[0][i]).add(edges[1][i]);
			adj.get(edges[1][i]).add(edges[0][i]);
		}
		// done with make adjacent list;
		Queue<Integer> queue = new LinkedList<Integer>();
		ArrayList<Integer> result = new ArrayList<Integer>();
		boolean[] visited = new boolean[vertex];
		for (int u = 0; u < vertex; u++) {
			if (visited[u]) {
				continue;
			}
			visited[u] = true;
			queue.offer(u);
			result.add(u);
			while (!queue.isEmpty()) {
				int u2 = queue.poll();
				ArrayList<Integer> subResult = new ArrayList<Integer>();
				for (int v : adj.get(u2)) {
					if (!visited[v]) {
						visited[v] = true;
						queue.offer(v);
						subResult.add(v);
					}
				}
				Collections.sort(subResult);
				result.addAll(subResult);
			}
		}
		return result;

	}
}

