class Solution {
    public int[] plusOne(int[] d) {
        int c = 1;
        for (int i = d.length - 1; i >= 0 && c == 1; i--) {
            int tmp = d[i] + c;
            if (tmp >= 10) {
                c = 1;
                d[i] = tmp % 10;
            } else {
                c = 0;
                d[i] = tmp;
            }
        }
        if (c != 0) {
            int[] n = new int[d.length+1];
            n[0] = 1;
            for (int i = 1; i < n.length; i++) {
                n[i] = d[i-1];
            }
            return n;
        }
        return d;
    }
}
