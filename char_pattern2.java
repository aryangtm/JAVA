import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        int  x = i.nextInt();
        for(int k = 1;k<=x;k++){
            char  ch = (char)('A' + x - k ) ;
            for (int j = 1; j <= k; j++) {
                System.out.print(ch+" ");
                ch  = (char)(ch +1);
            }
            System.out.println();
        }
    }
}
