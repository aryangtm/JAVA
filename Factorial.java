import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner k = new Scanner(System.in);
        int a = k.nextInt();
        Factorial(a);
    }
    static void Factorial(int a)
    {
        long f=1;
        for(int n = a;n>=1;n--)
        {
            f=f*n;
            
        }
        System.out.println(f);
    }
}
