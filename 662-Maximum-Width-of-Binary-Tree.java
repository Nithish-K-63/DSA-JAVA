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
class Pair{
    TreeNode node;
    int index;
    Pair(TreeNode node , int index){
        this.node = node;
        this.index = index;
    }
}
class Solution {
    public int widthOfBinaryTree(TreeNode root) {
        Queue<Pair> q = new LinkedList<>();
        int maxi = 0 , min_idx = 0 , max_idx = 0;
        q.offer(new Pair(root , 0));
        while(!q.isEmpty()){
            int s = q.size();
            for(int i=0;i<s;i++){
                Pair temp = q.poll();
                TreeNode node = temp.node;
                int idx = temp.index;
                if(i==0) min_idx = idx;
                if(i==s-1) max_idx = idx;
                if(node.left!=null) q.offer(new Pair(node.left , 2*idx +1));
                if(node.right!=null) q.offer(new Pair(node.right , 2*idx+2));
            }
            int w = max_idx - min_idx +1;
            if(w>maxi) maxi = w;
        }
        return maxi;
    }
}