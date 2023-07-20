class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
		ArrayList<List<Integer>> ans = new ArrayList<List<Integer>>();
        com(nums,0,ans,new ArrayList<Integer>());
        return ans;
    }
    public static void com(int[] nums,int ind,ArrayList<List<Integer>> ans,ArrayList<Integer> ds){
        ans.add(new ArrayList<>(ds));
        for(int i = ind;i<nums.length;i++){
            if(i!=ind && nums[i]==nums[i-1])continue;
            ds.add(nums[i]);
            com(nums,i+1,ans,ds);
            ds.remove(ds.size()-1);
        }
       
    }

}
