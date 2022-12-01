class Solution {
    int print2largest(int arr[], int n) {
        int max = -1;
        int m2 = -1 ;
        for(int i = 0 ;i<n;i++ )
        {
            if(max<arr[i])
            {
                m2=max;
                max=arr[i];
            }
            else if(m2<arr[i]&&arr[i]!=max)
                {
                    m2=arr[i];    
                }
            
            
        }
        return m2;
    }
}
