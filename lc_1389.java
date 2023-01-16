class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
    int[]  a = new int[index.length];
    int[] temp = new int[nums.length];
    for(int i =0;i<index.length;i++){
        if(temp[index[i]]>0||a[index[i]]!=0){
            for(int j = nums.length-2;j>=index[i];j--){
                a[j+1]=a[j];
            }
        }
        a[index[i]]=nums[i];
        temp[index[i]]++;
    } 
    return a;
     }
}
