class Solution {
    public int numberOfAlternatingGroups(int[] a) {
      int ans  = 0;
      int n = a.length;
      for(int i = 1;i<n-1;i++){
        if(a[i]!=a[i-1]&&a[i]!=a[i+1])ans++;
      } 
     if(a[0]!=a[n-1]&&a[0]!=a[1])ans++;
    if(a[n-1]!=a[n-2]&&a[n-1]!=a[0])ans++;
      return ans; 
    }
}
