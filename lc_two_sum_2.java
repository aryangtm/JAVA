class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] a = new int[2];
        int low = 0;
        int right= numbers.length-1;
        while(low<right){
            if(numbers[low]+numbers[right]==target){
                a[0]=low+1;
                a[1]=right+1;
                return a;
            }
            else if(numbers[low]+numbers[right]>target){
                right--;
            }
            else{
                low++;
            }
        }
        return a;
    }
}
