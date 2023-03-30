class Solution {
    public int countOdds(int lo, int high) {
        int total = high - lo + 1;
        if(total % 2 == 0)
            return total / 2;
        else {
            if(lo % 2 != 0)
                return total/2 + 1;
            else 
                return total/2;
        }
    }
}
