class Solution {
    public int finalValueAfterOperations(String[] a) {
        int mx =0;
        for(int i=0;i<a.length;i++){
            if(a[i].charAt(1)=='-'){
                --mx;
            }else{
                mx++;
            }
        }
        return mx;
    }
}
