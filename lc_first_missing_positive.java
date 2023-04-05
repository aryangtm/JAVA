class Solution {
    public int firstMissingPositive(int[] a) {
        HashSet<Integer> s = new HashSet<Integer>();
        Arrays.sort(a);
        for(int i = 0;i<a.length;i++){
            s.add(a[i]);
        }
        int c=1;
        for(int i =0;i<a.length;i++){
            if(!s.contains(c)){
                return c;
            }
            else{
                c=c+1;
            }
        }
        return c;
    }
}
