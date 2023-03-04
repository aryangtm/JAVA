class Solution {
    public int diagonalSum(int[][] a) {
        int sum =0;
        for(int i =0;i<a.length;i++){
            for(int j =0;j<a[i].length;j++){
                if(i==j||i+j==a.length-1){
                    sum = sum+a[i][j];
                }
            }
        }       
        return sum;
    }
}
