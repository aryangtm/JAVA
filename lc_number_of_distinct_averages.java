class Solution {
    public int distinctAverages(int[] nums) {
        Arrays.sort(nums);
        int l = 0;
        HashSet<Double> s = new HashSet<Double>();
        int h = nums.length-1;
        while(l<=h){
            s.add((double)(nums[l]+nums[h])/2);
            l++;
            h--;
        }
        return s.size();
    }
}
