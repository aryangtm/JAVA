class Solution {
    public int numRescueBoats(int[] p, int limit) {
       int b = 0;
        Arrays.sort(p);
        int l = 0;
        int r = p.length-1;
        while(l<=r){
            if(p[r]+p[l]<=limit){
                b++;
                l++;
                r--;
            }
            else{
                b++;
                r--;
            } 
        }
        return b;
    }
}
