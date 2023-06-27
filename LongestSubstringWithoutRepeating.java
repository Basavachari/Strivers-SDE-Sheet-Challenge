import java.util.* ;
import java.io.*; 
public class Solution 
{
	public static int uniqueSubstrings(String input) 
    {
		//write your code here
		int ans = Integer.MIN_VALUE;
		int n = input.length();
		int l = 0;
		Set<Character> set = new HashSet<Character>();
		for(int i=0;i<n;i++){
			if(set.contains(input.charAt(i))){
				while(l<i && set.contains(input.charAt(i))){
					set.remove(input.charAt(l));
					l++;
				}
			}
			set.add(input.charAt(i));
			ans = Math.max(ans,i-l+1);
		}
		return ans;
	}
}
