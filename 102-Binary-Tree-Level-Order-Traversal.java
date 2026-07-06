//102
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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if(root==null) return ans;
        Queue<TreeNode> q = new LinkedList<>();
        //s1
        q.offer(root);
        while(!q.isEmpty()){ //keep track of the levels
            List<Integer> temp = new ArrayList<>();
            int s = q.size(); // number of elements in current level
            for(int i=0; i<s; i++){
                TreeNode node = q.poll();//O(1) for normal queue
                temp.add(node.val);
                if(node.left != null) q.offer(node.left);//O(1)
                if(node.right != null) q.offer(node.right);
            }
            ans.add(temp);
        }
        return ans;
    }
}