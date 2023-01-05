class Solution {
    public int findMaxConsecutiveOnes(int[] a) {
        int res=0;
        int c=0;
        int n = a.length;
        for(int i = 0;i<n;i++){
            if(a[i]==0){
                c=0;
            }
            else
            {
                c++;
                res=Math.max(res,c);
            }
        }
        return res;
        
    }
}
