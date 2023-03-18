import java.util.Arrays;
import java.util.Scanner;

class Solution{
    public static void main(String[] args) {
        Scanner  r = new Scanner(System.in);
        int t = r.nextInt();
        int[] a =  new int[t];
        for (int j = 0; j < t; j++) {
            a[j] = r.nextInt();


            if(a[j]%5!=0){
                int temp = a[j]/5;
                temp=temp+1;
                temp=temp*5;
                int t1 = temp-a[j];
                if(t1<3&&a[j]+t1>=40){
                    a[j] = temp;
                }
            }
        }
        for(int k = 0;k<t;k++){
            System.out.println(a[k]);
        }
    }

}
