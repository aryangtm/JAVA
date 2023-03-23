class Solution {
    public int maxSatisfaction(int[] a) {
        Arrays.sort(a);
        int s = 0;
        int ans = 0;
        int f =1;
        for(int i = 0;i<a.length;i++){
            f=1;
            s=0;
            for(int j = i;j<a.length;j++){
                s=s+a[j]*f;
                f++;
            }
            ans=Math.max(ans,s);
        }
        return ans;
    }
}
