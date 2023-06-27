public class Solution 
{
	public static String reverseString(String str) 
	{
		//Write your code here
		// str = str.trim().stripLeading().stripTrailing();
		String[] words = str.split(" ");
		String ans = "";
		for(int i = words.length-1;i>=0;i--){
			ans+=words[i];
			ans +=" ";
		}
return ans;
	}
}
