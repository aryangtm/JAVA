import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner i = new Scanner(System.in);
        int n = i.nextInt();
        int a = 0;
        int b = 1;
        int c =2;
        while (c <= n)
        {
            int t=b;
            b=b+a;
            a=t;
            c++;
        }
        System.out.println(b);
    }
}
