class Solution {
    public int maxProfit(int[] a) {
        int x = a.length;
        int p = 0;
        for (int j = 1; j < x; j++) {
            if(a[j]>a[j-1]){
                p=p+(a[j]-a[j-1]);
            }
        }
        return p;
        
    }
}
