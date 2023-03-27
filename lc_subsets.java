class Solution {
    public List<List<Integer>> subsets(int[] nums) {
		aryan(nums,new ArrayList<>(),0);
        return ans;
    }
    List<List<Integer>> ans=new ArrayList<List<Integer>>();
    public void aryan(int nums[],List<Integer> al,int i){
        if(i==nums.length){
            ans.add(new ArrayList<>(al));
            return;
        }
        aryan(nums,al,i+1);
        al.add(nums[i]);
        aryan(nums,al,i+1);
        al.remove(al.size()-1);
    }
}
