import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner i = new Scanner(System.in);
        int a = i.nextInt();
        Vote(a);
    }
    static void Vote(int a)
    {
        if(a>=18)
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
    }
}
