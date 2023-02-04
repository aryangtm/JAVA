class Solution {
    public int finalValueAfterOperations(String[] a) {
        int x =0;
        for(int i=0;i<a.length;i++){
            if(a[i].charAt(1)=='-'){
                --x;
            }else{
                x++;
            }
        }
        return x;
    }
}
