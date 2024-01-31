class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int ans = nums[0]+nums[1]+nums[nums.length-1];
        for(int i = 0;i<nums.length;i++){
            int start = i+1;
            int last = nums.length-1;
            while(start<last){
                int current_sum=nums[i]+nums[start]+nums[last];
                if(current_sum==target)return target;
                if(current_sum>target)last--;//as last pointer is at highest value to make current sum small we decrement the index
                else if(current_sum<target)start++;//as start pointer is at starting means at smaller value to increase the sum we increment it
                if(Math.abs(current_sum-target)<Math.abs(ans-target)){
                    ans=current_sum;
                }
            }
        }
        return ans;
    }
}
