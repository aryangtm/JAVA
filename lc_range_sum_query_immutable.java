class NumArray {
     int[] p_s;
    
    public NumArray(int[] nums) {
        if (nums == null || nums.length == 0) {
            return;
        }
        p_s = new int[nums.length];
        p_s[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            p_s[i] = p_s[i - 1] + nums[i];
        }
    }
    
    public int sumRange(int left, int right) {
        if (p_s== null || left< 0 || right>= p_s.length || left> right) {
            return 0;
        }
        if (left == 0) {
            return p_s[right];
        }
        return p_s[right] - p_s[left - 1];
    }
}


/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */
