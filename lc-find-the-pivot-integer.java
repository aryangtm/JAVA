class Solution {
    public int pivotInteger(int n) {
         // Mathematical formula: x = √(n(n+1)/2)
        // The pivot exists only if this is a perfect square
        
        long sum = (long) n * (n + 1) / 2;
        // We use long to prevent integer overflow
        // For n = 100000, n*(n+1) could exceed int range
        
        long x = (long) Math.sqrt(sum);
        // Math.sqrt returns double, we cast to long to get integer part
        
        // Check if x is the exact square root (perfect square)
        if (x * x == sum) {
            return (int) x;
        }
        
        return -1; // No perfect square root means no pivot exists
    }
}
