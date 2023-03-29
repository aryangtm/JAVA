class Solution {
    List<List<Integer>> ans = new ArrayList<List<Integer>>();
    ArrayList a = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        jaiShreeRam(0,candidates,target);
        return ans;
    }
    void jaiShreeRam(int i,int[] candidates,int target){
        if(i==candidates.length){
            if(target==0){
                ans.add(new ArrayList<>(a));
            }
            return ;
        }
        if(candidates[i]<=target){
            a.add(candidates[i]);
            jaiShreeRam(i,candidates,target-candidates[i]);
            a.remove(a.size()-1);
        }
        jaiShreeRam(i+1,candidates,target);

    }
}
