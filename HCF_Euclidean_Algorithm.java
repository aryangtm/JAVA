import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        int x = i.nextInt();
        int y = i.nextInt();
        int a = Hcf(x,y);
        System.out.println(a);
    }
        static int  Hcf(int a,int b)
        {
            if(b==0)
            {
                return a;

            }
            else {
                return Hcf(b,a%b);
            }
        }

    }
