import java.util.Scanner;
class Solution {

    int subtractProductAndSum(int n) {
            int s=0,p,r,result,f=1;
            while(n>0)
            {
                 r = n%10;
                 f = f*r;
                 s=s+r;
                 n=n/10;
            }
            result=f-s;
            return(result);
        
    }
            
}
public class Main
{
    public static void main(String[] args)
    {
            Scanner i = new Scanner(System.in);
            int x = i.nextInt();
            Solution s = new Solution();
            int ss=s.subtractProductAndSum(x);
            System.out.println(ss);
    }
}
