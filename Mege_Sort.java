import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

class Merge_sort {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        divide(arr, 0, n - 1);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void divide(int[] arr, int low, int high) {
        if (low == high)
            return;
        int mid = (low + high) / 2;
        divide(arr, low, mid);
        divide(arr, mid + 1, high);
        merge(arr, low, mid, high);
    }

    public static void merge(int[] arr, int low, int mid, int high) {
        ArrayList<Integer> al = new ArrayList<>();
        int left = low;
        int right = mid + 1;
        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                al.add(arr[left]);
                left++;
            } else {
                al.add(arr[right]);
                right++;
            }
        }
        while (left <= mid) {
            al.add(arr[left]);
            left++;
        }
        while (right <= high) {
            al.add(arr[right]);
            right++;
        }
        for (int i = low; i <= high; i++) {
            arr[i] = al.get(i - low);
        }
    }
}
