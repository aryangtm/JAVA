class Solution {
    public int[][] generateMatrix(int n) {
        int top = 0;
        int left = 0;
        int bottom = n-1;
        int right = n-1;
        int[][] ans = new int[n][n];
        int ok = 1;
        while(top<=bottom && left<=right && ok<=n*n){
            for(int i = left;i<=right;i++){
                ans[top][i] = ok;
                ok++;
            }
            top++;
            for(int i = top;i<=bottom;i++){
                ans[i][right]=ok;
                ok++;
            }
            right--;
            if(top<=bottom){
                for(int i = right;i>=left;i--){
                    ans[bottom][i]=ok;
                    ok++;
                }
                bottom--;
            }
            if(left<=right){
                for(int i = bottom;i>=top;i--){
                    ans[i][left]=ok;
                    ok++;
                }
                left++;
            }
        }
        return ans;
    }
}
