class Solution {
    public int[] separateDigits(int[] nums) {
        List<Integer> al=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int x=al.size();
            while(nums[i]>0){
                al.add(x,nums[i]%10);
                nums[i]/=10;
            }
        }
        int arr[]=new int[al.size()];
        int c=0;
        for(int i:al)
        arr[c++]=i;
        return arr;
    }
}
