/*************************************************************

Following is the Binary Tree Node structure:

    class TreeNode<T> {
		public T data;
		public BinaryTreeNode<T> left;
		public BinaryTreeNode<T> right;

		TreeNode(T data) {
			this.data = data;
			left = null;
			right = null;
	  	}
    }

*************************************************************/
import java.lang.Math;
public class Solution {
	public static int height(TreeNode<Integer> root, int[] diameter){
		if(root== null) return 0;
		int lh = height(root.left,diameter);
		int rh = height(root.right,diameter);
		diameter[0] = Math.max(diameter[0], lh+rh);
		return 1+ Math.max(lh,rh);
	}
	public static int diameterOfBinaryTree(TreeNode<Integer> root) {
		// Write your code here.
		int[] diameter = new int[1];
		height(root, diameter);
		return diameter[0];
	}
}