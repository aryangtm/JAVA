class Solution {
    public int jump(int[] nums) {
        int a = 0;
        int count=0;
        int b=0;
     for(int i =0;i<nums.length-1;i++){
         a = Math.max(a,i+nums[i]);
        if(b==i){
            b=a;
            count++;
        }
     } 
     return count;
    }
}
