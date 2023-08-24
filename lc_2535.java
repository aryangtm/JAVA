class Solution {
    public int differenceOfSum(int[] nums) {
        int s =0;
        int s1=0;
        for(int i=0; i<nums.length; i++){
            s += nums[i];
            while(nums[i] != 0){
                s1 += nums[i]%10;
                nums[i] /= 10;
            }
        }
        return Math.abs(s1-s);
    }
}
