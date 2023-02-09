class Solution {
    public int mySqrt(int x) {
        long low = 1;
        long high = x;
        long ans =0;
        while(low<=high){
            long mid = (low+high)/2;
            long ms = mid*mid;
            if(ms==x)
            return (int)mid;
            if(ms>x)
            high=mid-1;
            else{
                low=mid+1;
                ans=mid;
            }
        }
        return(int)ans;
    }
}
