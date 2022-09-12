import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner i = new Scanner(System.in);
        int n = i.nextInt();
        for(int k = 1;k<=10;k++)
        {
            int r = n*k;
            System.out.println(n+" x "+k+" = "+r);
        }
    }
}
