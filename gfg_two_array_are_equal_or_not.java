class Solution{
    //Function to check if two arrays are equal or not.
    public static boolean check(long A[],long B[],int N)
    {
        Arrays.sort(A);
        Arrays.sort(B);
        for(int k = 0;k<N;k++){
            if(A[k]!=B[k]){
                return false;
            }
        }
        return true;
    }
}
