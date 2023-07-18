class Solution {
    public List<List<Integer>> combine(int n, int k) {
        ArrayList<List<Integer>> ans = new ArrayList<List<Integer>>();
        com(1,0,n,k,ans, new ArrayList<Integer>());
        return ans;
    }
    public static void com(int ind,int count,int n,int k,List<List<Integer>> ans,List<Integer> ds){
        if(count==k){
            ans.add(new ArrayList<Integer>(ds));
            return;
        }
        for(int i = ind;i<=n;i++){
            ds.add(i);
            com(i+1,count+1,n,k,ans,ds);
            ds.remove(ds.size()-1);
           

        }

    }
}
