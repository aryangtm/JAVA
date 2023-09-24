class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new LinkedList<List<Integer>>();
        for(int i = 0;i<nums.length;i++){
          if(i>0 && nums[i]==nums[i-1])continue;
          for(int j = i+1;j<nums.length;j++){
            if(j>i+1&& nums[j]==nums[j-1])continue;
            int k = j+1;
          int l = nums.length-1;
          while(k<l){
            long sum = nums[i]+nums[j];
            sum = sum+nums[k]+nums[l];
            if(sum==target){
            ArrayList a = new ArrayList<Integer>();
              a.add(nums[i]);
              a.add(nums[j]);
              a.add(nums[k]);
              a.add(nums[l]);
              ans.add(a);
              l--;
              k++;
              while(k<l && nums[l]==nums[l+1])l--;
              while(k<l && nums[k]==nums[k-1])k++;
            }
            else if(sum>target)l--;
            else if(sum<target)
            k++;
          }
        }
    }
    return ans;
    }
}
