class Solution {
    public int smallestEqual(int[] a) {
        int x = a.length;
ArrayList<Integer> al = new ArrayList<>();
        for (int j = 0; j < x; j++) {
            if(j%10==a[j]){
                al.add(j);
            }
        }
        if(al.isEmpty()){
            al.add(-1);
        }
        int[] ans = new int[al.size()];
        for (int j = 0; j <al.size(); j++) {
            ans[j]=al.get(j);
        }
        Arrays.sort(ans);
        return ans[0];

    }
}
