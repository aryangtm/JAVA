class Solution {
    public List<Integer> majorityElement(int[] a) {
        List<Integer> al = new ArrayList<>();
        int  c=0;
        int x = a.length;
        int ch = x/3;
        for (int j = 0; j < x; j++) {
            c=0;
            for (int k = j+1; k < x ; k++) {
                if(a[j]==a[k]){
                    c++;
                }
            }
            if(c>=x/3){
                if(!al.contains(a[j])){
                    al.add(a[j]);
                }
            }
        }
        return al;
    }
}
