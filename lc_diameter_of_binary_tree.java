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
    public int diameterOfBinaryTree(TreeNode root) {
        int[] d = new int[1];
        jaiShreeRam(root,d);
        return d[0];
    }
    public static int jaiShreeRam(TreeNode root,int[] d){
        if(root==null){
            return 0;
        }
        int l = jaiShreeRam(root.left,d);
        int r = jaiShreeRam(root.right,d);
        d[0]=Math.max(d[0],l+r);
        return 1+Math.max(l,r);

    } 
}
