class Solution {
    List<List<Integer>> ans = new ArrayList<List<Integer>>();
    ArrayList a = new ArrayList<>();
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        jaiShreeRam(0,candidates,target);
        return ans;
    }
    void jaiShreeRam(int ind,int[] candidates,int target){
        if(target==0){
            ans.add(new ArrayList<>(a));
            return;
        }
    for(int i = ind;i<candidates.length;i++){
        if(i > ind && candidates[i]==candidates[i-1])continue;
        if(candidates[i]>target)break;
        a.add(candidates[i]);
        jaiShreeRam(i+1,candidates,target-candidates[i]);
        a.remove(a.size()-1);
    }

    }
}
