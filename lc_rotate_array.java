class Solution {
    public void rotate(int[] a, int k) {
        int n = a.length;
        k=k%n;
        arev(a,0,n-k-1);
        arev(a,n-k,n-1);
        arev(a,0,n-1);
    }
    static void arev(int[] a,int low,int high){
        while(low<high){
            int temp = a[low];
            a[low]=a[high];
            a[high]=temp;
            low++;
            high--;
        }
    }
}
