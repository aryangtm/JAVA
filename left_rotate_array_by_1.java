
import java.util.*;
class X{
    public static void main(String[] args) {
        Scanner i  = new Scanner(System.in);
        int x = i.nextInt();
        int[] a = new int[x];
        for (int j = 0; j < x ; j++) {
            a[j]=i.nextInt();
        }
        int temp = a[0];
        for (int j = 1; j < x ; j++) {
            a[j-1] = a[j];
        }
        a[x-1]=temp;
        System.out.println(Arrays.toString(a));
        }
    }
