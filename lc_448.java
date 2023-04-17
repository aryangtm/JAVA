class Solution {
    public List<Integer> findDisappearedNumbers(int[] a) {
        HashSet<Integer> si = new HashSet<Integer>();
        List<Integer> ans = new ArrayList<>();
        for(int i = 0;i<a.length;i++){
            si.add(a[i]);
        }
        for(int i =1;i<=a.length;i++){
            if(!si.contains(i)){
                ans.add(i);
            }
        }
        return ans;
    }
}
