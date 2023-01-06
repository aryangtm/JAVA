class Solution {
    public int maxSubArray(int[] a) {
        int res = a[0];
        int maxi = a[0];
        int n = a.length;
        for(int i = 1;i < n;i++){
            maxi=Math.max(maxi+a[i],a[i]);
            res=Math.max(maxi,res);
        }
        return res;
    }
}
