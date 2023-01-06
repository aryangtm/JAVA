class Solution {
    public int removeDuplicates(int[] a) {
         int c =1;
        int x = a.length;
        for (int j = 1; j <x ; j++) {
            if(a[j]!=a[c-1]){
                a[c]=a[j];
                c++;
            }
        }
        return c;  
        
    }
}
