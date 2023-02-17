class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        for(int i = 0;i<nums1.length;i++){
            for(int j =0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]&&!al.contains(nums1[i])){
                    al.add(nums1[i]);
                }
            }
        }
        int[] a = new int[al.size()];
        for (int i = 0; i < al.size(); i++) {
            a[i] = al.get(i);
        }
        return a;
    }
}
