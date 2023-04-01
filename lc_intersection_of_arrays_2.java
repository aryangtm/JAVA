class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        ArrayList<Integer> al1 = new ArrayList<Integer>();
        for(int i : nums1)al.add(i);
        for(int i =0;i<nums2.length;i++){
            if(al.contains(nums2[i])){
                al1.add(nums2[i]);
                al.remove(Integer.valueOf(nums2[i]));
            }
        }
        int[] a = new int[al1.size()];
        for (int i = 0; i < al1.size(); i++) {
            a[i] = al1.get(i);
        }
        return a;    
   }

}
