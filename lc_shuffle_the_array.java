class Solution {
    public int[] shuffle(int[] nums, int n) {
    int[] a = new int[2*n];
    int e=0;
    a[0]=nums[0];
    int c = n-1;
    int o = 1;
    a[a.length-1]=nums[nums.length-1];
    for(int i =1;i<a.length-1;i++){
        if(i%2!=0){
            ++e;
        a[i]=nums[c+e];
        }
        else{
            a[i]=nums[o];
            o++;
        }
    }
    return a;
    }
}
