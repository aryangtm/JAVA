import java.util.*;
class X{
    public static void main(String[] args) {
        Scanner i  = new Scanner(System.in);
        int x = i.nextInt();
        int[] a = new int[x];
        for (int j = 0; j < x ; j++) {
            a[j] = i.nextInt();
        }
        int flag = 0;
        for (int k = 1; k < x ; k++) {
            if(a[k]<a[k-1]){
                flag=1;
                break;
            }
        }
        if(flag==0){
        System.out.println("Array is sorted");}
        if (flag == 1) {
            System.out.println("Array is not sorted");
        }
        }
    }
