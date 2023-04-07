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
    public int minDepth(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        int c =1;
        if(root==null)return 0;
        q.offer(root);
        while(!q.isEmpty()){
            int s = q.size();
            while(s>0){
                    TreeNode n = q.poll();
                    if(n.left==null&&n.right==null)return c;
                    if(n.left!=null)q.offer(n.left);
                    if(n.right!=null)q.offer(n.right);
                    s--;
            }
            c++;
        }
        return c;
    }
}
