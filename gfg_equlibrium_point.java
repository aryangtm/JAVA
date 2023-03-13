class Solution {

    
    // a: input array
    // n: size of array
    // Function to find equilibrium point in the array.
    public static int equilibriumPoint(long a[], int n) {

        long s1=0,s2=0;
        for(int i = 0;i<n;i++)s1=s1+a[i];
        for(int i = 0;i<n;i++){
            s1=s1-a[i];
            if(s1==s2){
                return i+1;
            }
            else{
                s2=s2+a[i];
            }
        }
        return 0;
    }
}
