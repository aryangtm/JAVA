
import java.util.*;
class X{
    public static void main(String[] args) {
        Scanner i  = new Scanner(System.in);
        int x = i.nextInt();
        int[] a = new int[x];
        for (int j = 0; j < x ; j++) {
            a[j]=i.nextInt();
        }
        int count = 0 ;
        for (int k = 0; k < x; k++) {
            if(a[k]!=0){
                int temp = a[count];
                a[count]=a[k];
                a[k] = temp;
                count++;
            }
        }
        System.out.println(Arrays.toString(a));
        }
    }
