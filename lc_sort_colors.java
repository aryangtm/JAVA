class Solution {
    public void sortColors(int[] nums) {
     for(int i = 0;i<=nums.length-2;i++){
         int min = i;
         for(int j = i;j<=nums.length-1;j++)
         {
             if(nums[j]<nums[min]){
                 min=j;
             }
         }
            int t = nums[min];
            nums[min]=nums[i];
            nums[i]=t;

     }   
    }
}
