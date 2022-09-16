import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner i = new Scanner(System.in);
        int a = i.nextInt();
        EvenOdd(a);
    }
    static void EvenOdd(int a)
    {
        if(a%2==0)
        {
            System.out.println("Even");
        }
        else
        {
            System.out.println("Odd");
        }
    }
}
