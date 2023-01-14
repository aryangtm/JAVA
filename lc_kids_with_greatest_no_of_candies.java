class Solution {
    public List<Boolean> kidsWithCandies(int[] a, int x) {
        List<Boolean> re = new ArrayList<Boolean>();
        int m=0;
        for(int i =0;i<a.length;i++){
            m=Math.max(m,a[i]);
        }
        for(int i =0;i<a.length;i++){
            if(a[i]+x>=m){
                re.add(true);
            }
            else{
                re.add(false);
            }
        }
        return re;
    }
}
