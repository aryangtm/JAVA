class Solution {
    public int[] twoSum(int[] a, int t) {
        int[] re = new int[2];
        int x = a.length;
        for(int i = 0;i<x;i++){
            for(int j=i+1;j<x;j++){
                if(a[i]+a[j]==t){
                    re[0]=i;
                    re[1]=j;
                }
            }
        }
        return re;
    }
}
