class Solution {
    public int minLengthAfterRemovals(List<Integer> nums) {
        int n = nums.size();
        int i = 0;
        int j = (n+1)/2;
        int c = n;
        while(i<n/2&&j<n){
            if(nums.get(i)<nums.get(j)){
                c=c-2;
            }
            i++;
            j++;
        }
        return c;
    }
}
