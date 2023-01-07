class Solution{

    // arr: input array
    // n: size of array
    //Function to find the sum of contiguous subarray with maximum sum.
    long maxSubarraySum(int a[], int n){
        
        long res=a[0];
        int maxi=a[0];
        for(int i =1;i<n;i++){
            maxi=Math.max(maxi+a[i],a[i]);
            res=Math.max(maxi,res);
        }
        return res;
        
    }
    
}
