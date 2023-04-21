class Solution {
    int maxSum = Integer.MIN_VALUE;
    
    public int maxPathSum(TreeNode root) {
        getMaxSum(root);
        return maxSum;
    }
    
    private int getMaxSum(TreeNode node) {
        if (node == null) {
            return 0;
        }
        
        int leftMax = Math.max(0, getMaxSum(node.left));
        int rightMax = Math.max(0, getMaxSum(node.right));
        
        maxSum = Math.max(maxSum, node.val + leftMax + rightMax);
        
        return node.val + Math.max(leftMax, rightMax);
    }
}
