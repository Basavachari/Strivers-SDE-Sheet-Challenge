import java.util.* ;
import java.io.*; 
public class K_Max_Sum_Combination{
	public static ArrayList<Integer> kMaxSumCombination(ArrayList<Integer> a, ArrayList<Integer> b, int n, int k){
		// Write your code here.
		PriorityQueue<Integer> minQueue = new PriorityQueue<>();
		for(int i = 0;i<k;i++){
			minQueue.add(Integer.MIN_VALUE);
		}
		for(int V1 : a){
			for(int V2 : b){
				int sum =  V1+V2;
				if(minQueue.peek() < sum){
					minQueue.poll();
					minQueue.add(sum);
				}
			}
		}
		ArrayList<Integer> res = new ArrayList<>(k);
		while(!minQueue.isEmpty()){
			res.add(minQueue.poll());
		}
		Collections.reverse(res);
		return res;
	}
}