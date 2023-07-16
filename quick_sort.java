class Solution {
    public void sortColors(int[] nums) {
        quicksort(nums,0,nums.length-1);
    }
    public static void quicksort(int[] nums,int low,int high){
        if(low<high){
        int  p = partition(nums,low,high);
        quicksort(nums,low,p-1);
        quicksort(nums,p+1,high);
        }
    }
    public static int partition(int[] nums,int low,int high){
        int p = nums[low];
        int i = low;
        int j = high;
        while(i<j){
            while(nums[i]<=p&&i<=high-1){
                i++;
            }
            while(nums[j]>p&&j>=low+1){
                j--;
            }
            if(i<j){
                int temp = nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
            }
        }
        int temp = nums[j];
        nums[j]=nums[low];
        nums[low]=temp;
        return j;
    }
}
