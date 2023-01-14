class Solution {
    public int maximumWealth(int[][] a) {
        int ans = 0;
        int sum=0;
        int c = a[0].length;
        for(int i =0;i<a.length;i++){
            sum=0;
            for(int j = 0;j<c;j++){
                sum=sum+a[i][j];
            }

            ans=Math.max(ans,sum);
        }
        return ans;
    }
}
