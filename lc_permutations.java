class Solution {
    List<List<Integer>> ans = new ArrayList<List<Integer>>();
    ArrayList c = new ArrayList();
    public List<List<Integer>> permute(int[] nums) {
        aryan(nums,c);
        return ans;
    }
    void aryan(int[] a,ArrayList c){
        if(c.size()==a.length){
            ans.add(new ArrayList<>(c));
            return;
        }
        for(int i =0;i<a.length;i++){
            if(!c.contains(a[i])){
                c.add(a[i]);
                aryan(a,c);
                c.remove(c.size()-1);
            }
        }
    }
}
