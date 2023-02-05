class Solution {
    public int[] searchRange(int[] a, int d) {
        int[] al = new int[2];
        al[0]=-1;
        al[1]=-1;
        for(int i = a.length-1;i>=0;i--){
            if(a[i]==d){
                al[1]=i;
                break;
            }
        }
        for(int i = 0;i<a.length;i++){
            if(a[i]==d){
                al[0]=i;
                break;
            }
        }
        return al;
    }
}
            
