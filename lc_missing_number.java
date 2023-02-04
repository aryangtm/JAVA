class Solution {
    public int missingNumber(int[] nums) {
      ArrayList<Integer> al = new ArrayList();
      Arrays.sort(nums);
      for(int i =0;i<nums.length;i++){
          al.add(nums[i]);
      }
      int ans=0;
      for(int i =0;i<nums.length;i++){
          boolean f = al.contains(i);
          if(!f){
               return i;
          }
      }  
        return nums.length;
    }
}
