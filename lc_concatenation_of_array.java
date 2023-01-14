class Solution {
    public int[] getConcatenation(int[] a) {
        int x = a.length;
       int[] ans = new int[2*x];
       for(int i =0;i<ans.length;i++){
           if(i<x){
               ans[i]=a[i];
           }
           else{
               ans[i]=a[i-x];
           }
       }
       return ans;
    }
}
