class Solution {
    public int[] buildArray(int[] nums) {
    int[] as =new int[nums.length];
    for(int i =0;i<nums.length;i++){
        as[i]=nums[nums[i]];
    }
    return as;
    }
}
