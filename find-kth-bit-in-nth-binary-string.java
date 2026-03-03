class Solution {
    public char findKthBit(int n, int k) {
        // Base case: S1 = "0"
        if (n == 1) {
            return '0';
        }

        // middle index = 2^(n-1)
        int mid = 1 << (n - 1);  // bit shift: 1 * 2^(n-1)

        if (k == mid) {
            // Middle bit is always '1'
            return '1';
        } else if (k < mid) {
            // In the left part: same as S_{n-1}[k]
            return findKthBit(n - 1, k);
        } else {
            // In the right part: mirror in S_{n-1}, then invert
            // total length = 2^n - 1, mirror index = 2^n - k
            int mirror = (1 << n) - k;
            char bit = findKthBit(n - 1, mirror);
            // invert the bit
            return (bit == '0') ? '1' : '0'; 
    }
}
}
/*Middle index: mid = 2^(n-1)
(because (len + 1) / 2 = (2^n - 1 + 1)/2 = 2^(n-1))
Now, for a given k:

If k == mid
The middle character is always "1" (by definition of Si).

If k < mid
We are in the left part, which is exactly Sn-1.
So kth bit of Sn = kth bit of Sn-1.

If k > mid
We are in the right part, which is reverse(invert(Sn-1)).

Because of reverse, this maps to some index in Sn-1.
Instead of dealing with sub-indices, use mirroring on the full string:

Full length: len = 2^n - 1

The mirror index of position k around the center is:

text

mirror = len - k + 1 = (2^n - 1) - k + 1 = 2^n - k
This mirror is in the left half and corresponds to the original bit in Sn-1.

Then we invert that bit.
*/
