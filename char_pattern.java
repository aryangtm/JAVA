import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        int  x = i.nextInt();
        for(int k = 1;k<=x;k++){
            char  ch = (char)('A' + k -1) ;
            for (int j = 1; j <= x; j++) {
                System.out.print(ch+" ");
                ch  = (char)(ch +1);
            }
            System.out.println();
        }
    }
}
