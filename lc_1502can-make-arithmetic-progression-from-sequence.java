class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
      int n = arr.length;
        if (n <= 2) return true;
        
        // Step 1: Find min and max (would be first and last in AP)
        int min = arr[0], max = arr[0];
        for (int num : arr) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
        
        // Step 2: Calculate required common difference
        // In an AP: last = first + (n-1) * d
        // So: d = (last - first) / (n-1)
        if ((max - min) % (n - 1) != 0) {
            return false; // Common difference must be integer
        }
        int d = (max - min) / (n - 1);
        
        // Step 3: Check if all required AP terms exist in array
        Set<Integer> numSet = new HashSet<>();
        for (int num : arr) {
            numSet.add(num);
        }
        
        // Step 4: Verify each position in the AP
        for (int i = 0; i < n; i++) {
            int expectedValue = min + i * d;
            if (!numSet.contains(expectedValue)) {
                return false;
            }
        }
        
        return true;  
    }
}
