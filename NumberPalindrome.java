import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner i = new Scanner(System.in);
        int a = i.nextInt();
        String s =Palindrome(a);
        System.out.println(s);
    }
    static String Palindrome(int a)
    {
        int x =a;
        int sum=0;
        while(a>0)
        {
            int r = a%10;
            sum=sum*10+r;
            a=a/10;
        }
        if(x==sum)
        {
            return "Yes";
        }
        else
        {
            return "No";
        }
        
    }
}
