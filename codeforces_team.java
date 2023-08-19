import java.util.*;
import java.util.Scanner;

public class Team {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[][] arr = new int[n][3];
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = 0; j < 3; j++) {
                arr[i][j] = scan.nextInt();
                sum = sum + arr[i][j];
            }
            ans[i] = sum;
        }
        int c = 0;
        for (int i = 0; i < n; i++) {
            if (ans[i] > 1) {
                c++;
            }
        }
        System.out.print(c);

    }
}
