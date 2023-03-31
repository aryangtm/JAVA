class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int l = 0;
        int r = nums.length-1;
        int max = 0;
        while(l<r){
            max=Math.max(max,nums[l]+nums[r]);
            l++;
            r--;
        }
        return max;

    }
}
