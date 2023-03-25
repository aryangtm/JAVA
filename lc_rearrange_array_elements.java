class Solution {
    public int[] rearrangeArray(int[] nums) {
        int p =0;
        int n =1;
        int[] ans = new int[nums.length];
        for(int i = 0;i<nums.length;i++){
            if(nums[i]<0){
                ans[n]=nums[i];
                n=n+2;
            }
            else{
            ans[p]=nums[i];
            p=p+2;
            }
        }
        return ans;
    }
}
