import java.util.* ;
import java.io.*; 
/****************************************************************

    Following is the class structure of the Pair class:

        class Pair
        {
        	int weight;
	        int value;
	        Pair(int weight, int value)
	        {
		        this.weight = weight;
		        this.value = value;
	        }
	        
        }
        
*****************************************************************/

class itemComparator implements Comparator<Pair>
{
    @Override
    public int compare(Pair a, Pair b) 
    {
        double r1 = (double)(a.value) / (double)(a.weight); 
        double r2 = (double)(b.value) / (double)(b.weight); 
        if(r1 < r2) return 1; 
        else if(r1 > r2) return -1; 
        else return 0; 
    }
}
public class Solution {
    public static double maximumValue(Pair[] items, int n, int w) {
            // Write your code here.
    	    // ITEMS contains {weight, value} pairs.
			Arrays.sort(items,new itemComparator());

			double ans = 0.0;
			int weight = 0;
			for(int i=0;i<n;i++){
				if(weight+ items[i].weight <= w){
					weight += items[i].weight;
					ans += items[i].value;
				}
				else{
					int remW = w - weight;
					ans += (double)remW * ((double)items[i].value/(double)items[i].weight);
					break;
				}
			}

		return ans;
    }
}
