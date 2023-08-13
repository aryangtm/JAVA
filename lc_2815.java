class Solution {
    public int maxSum(int[] nums) {
        int c = -1;
        for(int i = 0;i<nums.length-1;i++){
            for(int j = i+1;j<nums.length;j++){
                int s1 = checkgr(nums[i]);
                int  s2 = checkgr(nums[j]);
                if(s1==s2){
                    c = Math.max(c,nums[i]+nums[j]);
                }
            }
        }
        return c;
    }
    public static int checkgr(int n){
        int s = 0;
        while(n>0){
            int  r = n%10;
            s = Math.max(s,r);
            n=n/10;
        }
        return s;
    }
}
