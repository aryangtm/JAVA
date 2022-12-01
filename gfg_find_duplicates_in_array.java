class Solution {
    public static ArrayList<Integer> duplicates(int arr[], int n) {
        ArrayList<Integer> l = new ArrayList<Integer>(n);
        int[] c = new int[n];
        int j =-1  ;
        for(int k = 0;k<n;k++)
        {

            c[arr[k]]++;
        }
        for(int k = 0;k<n;k++)
        {
            
            if(c[k]>1)
            {
                l.add(k);
            }
            }
            if(l.isEmpty())
        {
            l.add(j);
        }
        
        return l;
    }
}
