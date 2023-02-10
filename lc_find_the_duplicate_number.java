class Solution {
    public int findDuplicate(int[] a) {
        Arrays.sort(a);
        for(int i = 0;i<a.length;i++){
            int f = fo(a,a[i]);
            if(f>-1){
                int l = lo(a,a[i]);
                if(f!=l&&l!=-1){
                    return a[i];
                }
            }
        }
        return 0;
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
        return -1;
    }
}
