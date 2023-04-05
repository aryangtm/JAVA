class Solution {
    public List<Integer> findDisappearedNumbers(int[] a) {
        HashSet<Integer> s = new HashSet<Integer>();
        List<Integer> ans = new ArrayList<>();
        for(int i = 0;i<a.length;i++){
            s.add(a[i]);
        }
        for(int i =1;i<=a.length;i++){
            if(!s.contains(i)){
                ans.add(i);
            }
        }
        return ans;
    }
}
