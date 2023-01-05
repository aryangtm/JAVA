class Solution{
    
    // arr: input array
    // n: size of array
    // Function to find the trapped water between the blocks.
    static long trappingWater(int arr[], int n) { 
        long res=0;
        int[] lmax= new int[n];
        int[] rmax = new int[n];
        lmax[0]=arr[0];
        for(int i = 1;i<n;i++)
        {
         lmax[i]=Math.max(arr[i],lmax[i-1]);   
        }
        rmax[n-1]=arr[n-1];
        for(int i = n-2;i>=0;i--){
            rmax[i]=Math.max(arr[i],rmax[i+1]);
        }
        for(int i = 1 ; i< n-1;i++){
            res = res+(Math.min(lmax[i],rmax[i])-arr[i]);    
        }
        return res;
        
    } 
}
