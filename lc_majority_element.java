class Solution {
    public int majorityElement(int[] a) {
        int c=1,r=0;
        int n = a.length;
        for(int i =0;i<n;i++){
            if(a[r]==a[i]){
                c++;
            }
            else{
                c--;
            }
            if(c==0){
                r=i;
                c=1;
            }
        }
        c=0;
        for(int i =0;i<n;i++){
            if(a[r]==a[i]){
                c++;
            }
            if(c>n/2){
                return a[r];
            }
        }
        return -1;
    }
}
