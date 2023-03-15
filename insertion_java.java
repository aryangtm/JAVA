
import java.util.Arrays;
import java.util.Scanner;

class X{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n+1];
        System.out.println("Enter element you want to insert in the array : ");
        int x = in.nextInt();
        System.out.println("Enter index you want to insert element in : ");
        int idx = in.nextInt();
        for (int j = 0; j < n; j++) {
            arr[j] = in.nextInt();
        }
        for (int k = n-1; k >=idx ; k--) {
            arr[k+1] = arr[k];
        }
        arr[idx]=x;
        System.out.println(Arrays.toString(arr));

    }

}
