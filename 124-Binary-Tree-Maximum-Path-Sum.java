/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int f(TreeNode root,int [] maxi){
        if(root==null) return 0;
        int ls=f(root.left,maxi);
        int rs=f(root.right,maxi);
        if(ls<0) ls=0;
        if(rs<0)rs=0;
        int path_sum=ls+rs+root.val;
        if(path_sum>maxi[0])  maxi[0]=path_sum;
        return root.val+Math.max(ls,rs);
    }
    public int maxPathSum(TreeNode root) {
        int[] maxi=new int[1];
        maxi[0]=Integer.MIN_VALUE;
        int h=f(root,maxi);
        return maxi[0];
    }
}