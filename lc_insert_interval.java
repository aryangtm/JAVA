class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        ArrayList<int[]> li = new ArrayList<>();
        for(int[] i : intervals){
            li.add(i);
        }
        li.add(newInterval);
        intervals= li.toArray(new int[li.size()][]); 
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        ArrayList<int[]> al = new ArrayList<>();
        for(int[] i : intervals){
            if(al.size()==0){
                al.add(i);
            }
            int[] p = al.get(al.size()-1);
            if(i[0]<=p[1]){
                p[1]=Math.max(i[1],p[1]);
            }
            else{
                al.add(i);
            }
        }
       return  al.toArray(new int[al.size()][]); 
    }
}
