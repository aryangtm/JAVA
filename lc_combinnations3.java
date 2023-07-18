class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        ArrayList<List<Integer>> ans = new ArrayList<List<Integer>>();
        com(1,k,n,ans,new ArrayList<Integer>());
        return ans;
    }
    public static void com(int ind,int k,int n,ArrayList<List<Integer>> ans,ArrayList<Integer> ds){
        if(n==0&&k==0){
            ans.add(new ArrayList<Integer>(ds));
            return;
        }
        for(int i = ind;i<=9;i++){
            ds.add(i);
            com(i+1,k-1,n-i,ans,ds);
            ds.remove(ds.size()-1);
        }
    }
}
