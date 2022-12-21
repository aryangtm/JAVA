
import java.util.Scanner;

class Solution{
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        int s = i.nextInt();
        int t = i.nextInt();
        int a = i.nextInt();
        int b= i.nextInt();
        int m = i.nextInt();
        int[] mr = new int[m];
        int n = i.nextInt();
        int[] nr = new int[n];
        int c1=0;
        int c2=0;
        for (int j = 0; j < m; j++) {
            mr[j]=i.nextInt();
            mr[j]=mr[j]+a;
            if(mr[j]>=s&&mr[j]<=t){
                c1++;
            }
        }
        for (int k = 0; k < n; k++) {
            nr[k] = i.nextInt();
            nr[k]=nr[k]+b;
            if(nr[k]>=s&&nr[k]<=t){
                c2++;
            }
        }
        System.out.println(c1);
        System.out.println(c2);
    }

}
