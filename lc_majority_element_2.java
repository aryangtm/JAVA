class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int checker = (int)(nums.length/3)+1;
        List<Integer> ans= new LinkedList<Integer>();
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i= 0;i<nums.length;i++){
            int value = map.getOrDefault(nums[i],0);
            map.put(nums[i],value+1);
            if(map.get(nums[i])==checker){
                ans.add(nums[i]);
            }
            //if(ans.size()==checker)break;
        }
        return ans;
    }
}
