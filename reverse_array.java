import java.util.*;
class X{
    public static void main(String[] args) {
        Scanner i  = new Scanner(System.in);
        int x = i.nextInt();
        int[] a = new int[x];
        for (int j = 0; j < x ; j++) {
            a[j] = i.nextInt();
        }
        int low = 0;
        int high = x-1;
        while(low<high){
            int temp = a[low];
            a[low] = a[high];
            a[high]=temp;
            low++;
            high--;
        }
        System.out.print("Array after reverse");
        System.out.println(Arrays.toString(a));

        }
    }
