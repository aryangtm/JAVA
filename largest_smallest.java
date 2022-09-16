import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner i = new Scanner(System.in);
        int a = i.nextInt();
        int b = i.nextInt();
        int c = i.nextInt();
        int l=Largest(a,b,c);
        int s=Smallest(a,b,c);
        System.out.println("laregst  : "+l);
        System.out.println("Smallest : "+s);
    }
    static int Largest(int a,int b,int c)
    {
        int max=a;
        if(max<b)
        {
            max=b;
        }
        if(max<c)
        {
            max=c;
        }
        return max;
    }
    static int Smallest(int a,int b,int c)
    {
      int  min =a;
       if(min>b)
       {
           min=b;
       }
       if(min>c)
       {
           min=c;
       }
       return min;
       
    }
}
