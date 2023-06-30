public class Solution {	
	public static String longestPalinSubstring(String str) {
		// Write your code here.
		int n = str.length();
		if(str == null || n < 1 ) return "";
		int s = 0;
		int e = 0;

		for(int i = 0; i<n;i++){
			int l1 = palindromic(str,i,i);
			int l2 = palindromic(str,i,i+1);
			int l = Math.max(l1,l2);
			if(l > (e-s +1)){
				s = i - (l-1)/2;
				e = i + l/2;

			}
		}
		return str.substring(s,e+1);
	}
	static int palindromic(String s, int i, int j){
		int l = i;
		int r = j;
		while(l>=0 && r<s.length() && s.charAt(l)== s.charAt(r)){
			l--;
			r++;
		}
		return r-l-1;
	}
}
