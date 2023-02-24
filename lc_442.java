public class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> re = new ArrayList<>();
        for (int i = 0; i < nums.length; ++i) {
            int index = Math.abs(nums[i])-1;
            if (nums[index] < 0)
                re.add(Math.abs(index+1));
            nums[index] = -nums[index];
        }
        return re;
    }
}
