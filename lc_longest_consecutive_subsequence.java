class Solution {
    public int longestConsecutive(int[] a) {
    HashSet<Integer> s = new HashSet<Integer>();
    for(int i =0 ;i<a.length;i++)s.add(a[i]);
    int res = 0;
    for(int i =0;i<a.length;i++){
        if(!s.contains(a[i]-1)){
            int c = 1;
            while(s.contains(a[i]+c)){
                c++;
            }
            res = Math.max(c,res);
        }
    }
    return res;
    }
}
