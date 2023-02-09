class Solution {
    public int[] searchRange(int[] a, int d) {
        int[] al = new int[2];
        int fl = fo(a,d);
        int lw=lo(a,d);
        if(fl==-1){
            al[0]=-1;
            al[1]=-1;
            return al;
        }
        else{
            al[0]=fl;
            al[1]=lw;
        }
        return al;
    }
    public static int  fo(int[] a,int d) {
        int low =0;
        int high =a.length-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(a[mid]>d){
                high=mid-1;
            }
            else if(a[mid]<d){
                low=mid+1;
            }
            else{
                if(mid==0||a[mid-1]!=a[mid]){
                    return mid;
                }
                else{
                    high=mid-1;
                }
            }
        }
        return -1;
    }
    public static int lo(int[] a,int d) {
        int low=0;
        int high = a.length -1;
        while(low<=high){
            int mid = (low+high)/2;
            if(a[mid]>d){
                high=mid-1;
            }
            else if(a[mid]<d){
                low=mid+1;
            }
            else{
                if(mid==a.length-1||a[mid]!=a[mid+1]){
                    return mid;
                }
                else{
                    low=mid+1;
                }
            }
            
        }
        return 0;
    }
}
            
