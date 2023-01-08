class Solution {
    public int maximumDifference(int[] a) {
        int x = a.length;
        int min = a[0];
        int res = a[1]-a[0];
        for(int j =1;j<x;j++){
            res=Math.max(res,a[j]-min);
            min=Math.min(min,a[j]);
        }
        if(res==0||res<-1){
            return -1;
        }
        return res;

    }
}
