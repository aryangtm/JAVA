
import java.util.*;
class X{
    public static void main(String[] args) {
        Scanner i  = new Scanner(System.in);
        int x = i.nextInt();
        int d = i.nextInt();
        int[] a = new int[x];
        for (int j = 0; j < x ; j++) {
            a[j]=i.nextInt();
        }
        reverse(a,0,d-1);
        reverse(a,d,x-1);
        reverse(a,0,x-1);

        System.out.println(Arrays.toString(a));
        }
    static  void reverse(int[] a,int x,int d){
        int low = x;
        int high = d;
        while(low<high){
            int temp=a[low];
            a[low]=a[high];
            a[high]=temp;
            low++;
            high--;
        }
    }
    }
