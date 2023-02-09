class Solution {
    public boolean isPerfectSquare(int x) {

        long low = 1;
        long high = x;
        while(low<=high){
            long mid = (low+high)/2;
            long ms = mid*mid;
            if(ms==x)
            return true;
            if(ms>x)
            high=mid-1;
            else{
                low=mid+1;
            }
        }
        return false;
    }
}
