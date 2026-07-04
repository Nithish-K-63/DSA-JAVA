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
    //int maxi=0;
    int f(TreeNode root,int [] maxi){
        if(root==null) return 0;
        int  lh=f(root.left,maxi);
        int rh=f(root.right,maxi);
        int d=lh+rh;
        if(d>maxi[0]) maxi[0]=d;
        return 1+Math.max(lh,rh);
    }
    public int diameterOfBinaryTree(TreeNode root) {
        int [] maxi=new int[1];
        int heigth=f(root,maxi);
        return maxi[0];
    }
}