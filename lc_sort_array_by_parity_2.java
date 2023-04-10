class Solution {
    public int[] sortArrayByParityII(int[] nums) {
       int[] a = new int[nums.length];
       int e = 0;
       int o = 1;
       Arrays.sort(nums);
        for(int i = 0;i<nums.length;i++){
            if(nums[i]%2==0){
                a[e]=nums[i];
                e=e+2;
            }else{
                a[o]=nums[i];
                o=o+2;
            }
        }
       return a;
    }
}
