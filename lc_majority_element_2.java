class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int checker = (int)(nums.length/3)+1;
        List<Integer> ans= new LinkedList<Integer>();
        int c1 = 0,e1=0,c2=0,e2=0,count1 =0,count2=0;
        for(int i = 0;i<nums.length;i++){
            if(c1==0 && nums[i]!=e2){
                c1 = 1;
                e1 = nums[i];
            }
            else if( c2 == 0 && nums[i] != e1){
                c2 = 1;
                e2 = nums[i];
            }
            else if(e1==nums[i])c1++;
            else if(e2==nums[i])c2++;
            else{
                c1--;
                c2--;
            }
        }
        for(int i = 0;i<nums.length;i++){
            if(nums[i]==e1)count1++;
            else if(nums[i]==e2)count2++;
        }
        if(count1>=checker)ans.add(e1);
        if(count2>=checker)ans.add(e2);
        return ans;
    }
}
