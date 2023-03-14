class Solution {
    public static ArrayList<Integer> Solve(int x, int[] a) {
        ArrayList<Integer> al = new ArrayList<>();
        int  c=00;
        int ch = x/3;
        for (int j = 0; j < x; j++) {
            c=0;
            for (int k = j+1; k < x ; k++) {
                if(a[j]==a[k]){
                    c++;
                }
            }
            if(c>=x/3){
                if(!al.contains(a[j])){
                    al.add(a[j]);
                }
            }
        }
        boolean cha = al.isEmpty();
        if(cha){
            al.add(-1);
            return al;
        }
        else{
            return al;
        }
    }
}
