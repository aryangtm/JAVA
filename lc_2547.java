class Solution {
    public int[] leftRigthDifference(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            int leftSum = 0;
            int rightSum = 0;
            
            
            for (int j = 0; j < i; j++) {
                leftSum += nums[j];
            }
            
            
            for (int j = i + 1; j < n; j++) {
                rightSum += nums[j];
            }
            
            
            result[i] = Math.abs(leftSum - rightSum);
        }
        
        return result;
    }
}
