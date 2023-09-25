class Solution {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        Arrays.sort(nums1);Arrays.sort(nums2);Arrays.sort(nums3);Arrays.sort(nums4);
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i : nums1){
            for(int j : nums2){
                map.put(i+j,map.getOrDefault(i+j,0)+1);
            }
        }
        int ans = 0;
        for(int c : nums3){
            for(int d : nums4){
                ans = ans + map.getOrDefault(-(c+d),0);
            }
        }
        return ans;
    }
}
