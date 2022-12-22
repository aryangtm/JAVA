
import java.util.Arrays;
import java.util.Scanner;

class X{
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        int n = i.nextInt();
        int[] arr = new int[n+1];
        System.out.println("Enter index you want to delete element in : ");
        int idx = i.nextInt();
        for (int j = 0; j < n; j++) {
            arr[j] = i.nextInt();
        }
        for (int k = idx; k <n-1 ; k++) {
            arr[k] = arr[k+1];
        }
        for (int l = 0; l < n-1; l++) {
            System.out.println(arr[l]);
        }

    }

}
