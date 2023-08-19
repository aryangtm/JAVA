import java.util.*;

public class Cf_Next_Round {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        int[] ans = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            ans[i] = scan.nextInt();
            sum = sum + ans[i];
        }
        int a1 = 0;
        if (sum > 0) {
            for (int i = 0; i < n; i++) {
                if (ans[i] >= ans[k - 1] && ans[i] > 0)
                    a1 = a1 + 1;
            }
        }
        System.out.print(a1);
    }
}
