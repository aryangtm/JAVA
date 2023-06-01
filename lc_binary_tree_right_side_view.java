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
    ArrayList<Integer> a = new ArrayList<>();
    public List<Integer> rightSideView(TreeNode root) {
        jaiShreeRam(root,0);
        return a;
    }
    public void jaiShreeRam(TreeNode r,int level){
        if(r==null)return;
        if(a.size()==level)a.add(r.val);
        jaiShreeRam(r.right,level+1);
        jaiShreeRam(r.left,level+1);
    }
}
