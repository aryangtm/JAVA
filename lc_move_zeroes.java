class Solution {
    public void moveZeroes(int[] a) {
        int c=0;
        for(int i = 0;i<a.length;i++){
            if(a[i]!=0){
                int temp = a[c];
                a[c]=a[i];
                a[i]=temp;
                c++;
            }
        }
    }
}
