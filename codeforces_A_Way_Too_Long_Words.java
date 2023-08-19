import java.util.*;

public class string_aabbreviatio {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();
        for (int i = 0; i < test; i++) {
            String s = scan.next();
            if (s.length() > 10) {
                String ans = s.charAt(0) + Integer.toString(s.length() - 2) + s.charAt(s.length() - 1);
                System.out.println(ans);
            } else {
                System.out.println(s);
            }
        }
    }
}
