import java.util.*;
class Main{
    public static void main(String[] args)
    {
        Scanner i = new Scanner(System.in);
        int N = i.nextInt();
        int a[] = new int[N-1];
    for(int k = 0;k<N-1;k++)
        {
            a[k] = i.nextInt();
        }
        int o = Miss(a,N);
        System.out.println(o);
    }
    static int Miss(int[] a,int x)
    {
        int ans = 1;
        int[] c = new int[x];
        for(int i = 0;i<x-1;i++)
        {
            c[a[i]-1]++;
        }
        for(int j = 0;j<=x;j++)
        {
            if(c[j]==0)
            {
                ans  = ans+j;
                break;
            }
            
        }
        return ans;
    }
    
    
}
