class Solution {
    public int search(int[] a, int x) {
     int low = 0;
     int high = a.length-1;
     while(low<=high){
         int mid = (low+high)/2;
         if(a[mid]==x){
             return mid;
         }
         if(a[low]<=a[mid]){
             if(x>=a[low]&&x<a[mid]){
                 high=mid-1;
             }
             else{
                 low=mid+1;
             }
         }
         else{
             if(x>a[mid]&&x<=a[high]){
                 low=mid+1;
             }
             else{
                 high=mid-1;
             }
         }
     }  
     return -1;
    }
}
