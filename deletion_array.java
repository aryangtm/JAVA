import java.util.*;
class x{
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        System.out.print("Enter the Size of Array : ");
        int x = i.nextInt();
        int[] a = new int[x+1];
        System.out.print("Enter the index : ");
        int idx = i.nextInt();
        for (int j = 0; j < x; j++) {
            a[j]=i.nextInt();
        }
        for (int j = idx; j < x-1 ; j++) {
            a[j] = a[j+1];
        }
        x=x-1;
        for (int j = 0; j < x ; j++) {
            System.out.print(a[j]+" ");
        }
    }
}
