class Solution {
    public void nextPermutation(int[] a) {
        int ind = -1;
        for(int i = a.length-2;i>=0;i--){
            if(a[i]<a[i+1]){
                ind = i;
                break;
            }
        }
        if(ind==-1){
            arev(a,0,a.length-1);
            return;
        }
        for(int i = a.length-1;i>=ind;i--){
            if(a[i]>a[ind]){
                int temp = a[i];
                a[i]=a[ind];
                a[ind]=temp;
                break;
            }
        }
        arev(a,ind+1,a.length-1);

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
