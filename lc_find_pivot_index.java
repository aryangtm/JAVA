class Solution {
    public int pivotIndex(int[] a) {
        int s1=0,s2=0;
        int x = a.length;
        for(int i =0;i<x;i++)s1=s1+a[i];
        for(int i=0;i<x;i++){
            s1=s1-a[i];
            if(s1==s2){
                return i;
            }
            else{
                s2=s2+a[i];
            }
        }
        return -1;
    }
}
