class Solution
{
	// Function to find the peak element
	// arr[]: input array
	// n: size of array a[]
	public int peakElement(int[] arr,int n)
    {
        int c=0;
       for(int i = 1;i<n;i++){
           if(arr[i-1]<=arr[i]){
               c=i;
           }
       }
       return c;
    }
}
