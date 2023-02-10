class Solution {
    public double findMedianSortedArrays(int[] a, int[] b) {
        int[] m = new int[a.length+b.length];
        int ans  =0;
        int c =0;
        double ans1 = 0;
        for(int i =0;i<a.length;i++){
            m[i]=a[i];
            c++;
        }
        for(int i =0;i<b.length&&c<m.length;i++){
            m[c]=b[i];
            c++;
        }
        Arrays.sort(m);
        if(m.length==1){
            return(double)m[0];
        }
        if(m.length%2!=0){
            ans = (0+m.length-1)/2;
            return(double)m[ans];
        }
        else if(a.length==b.length||a.length==0||b.length==0){
            int mid = (0+m.length)/2;
            double an = (float)(m[mid]+m[mid-1])/2;
            return an;
        }
        ans = (0+m.length)/2;
        ans1 = (float)(m[ans]+m[ans-1])/2;
        return ans1;
    }
}
