class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
    Set<List<Integer>> ans = new HashSet<>();
    per(0,ans,nums);
    return new ArrayList<>(ans);
    }
    public static void per(int ind,Set<List<Integer>> ans,int[] nums){
        if(ind==nums.length){
            ArrayList<Integer> ds = new ArrayList<>();
            for(int i = 0;i<nums.length;i++){
                ds.add(nums[i]);
            }
            ans.add(new ArrayList<>(ds));
            return ;
        }
        int temp =0;
        for(int i = ind;i<nums.length;i++){
            temp = nums[i];
            nums[i]=nums[ind];
            nums[ind]=temp;
            per(ind+1,ans,nums);
            temp = nums[i];
            nums[i]=nums[ind];
            nums[ind]=temp;
        }
    }
}
