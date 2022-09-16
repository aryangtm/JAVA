import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner i = new Scanner(System.in);
        int a = i.nextInt();
        Prime(a);
    }
    static void Prime(int a)
    {
        int flag=1;
        int c = 2;
        while(c*c<=a)
        {
            if(a%c==0)
            {
                flag = 2;
                break;
            }
            c++;
        }
        if(flag==1)
        {
            System.out.println("Prime");
        }
        else if(flag==2)
        {
            System.out.println("Not Prime");
        }
    }
}
