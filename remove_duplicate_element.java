
import java.util.*;
class X{
    public static void main(String[] args) {
        Scanner i  = new Scanner(System.in);
        int x = i.nextInt();
        int[] a = new int[x];
        for (int j = 0; j < x ; j++) {
            a[j] = i.nextInt();
        }
        int[] temp = new int[x];
        temp[0]=a[0];
        int res = 1;
        for (int k = 1; k < x; k++) {
            if(temp[res-1]!=a[k]){
                temp[res]=a[k];
                res++;
            }
        }
        for (int l = 0; l < res; l++) {
            System.out.print(temp[l]+" ");
        }
        }
    }
