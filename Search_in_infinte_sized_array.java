import java.util.*;
public class Search_in_infinte_sized_array {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int x = i.nextInt();
        int[] a = new int[x];
        System.out.print("Enter the data you want to search : ");
        int d = i.nextInt();
        for (int j = 0; j < a.length; j++) {
            a[j]=i.nextInt();
        }
        int k =1;
        if(a[0]==x){
            System.out.println("0");
        }
        else{
            while(a[k]<d){
                k=k*2;
            }
            if(a[k]==d){
                System.out.println(k);
            }
            else{
                int ans  = Bs(a,d,k/2+1,k-1 );
                System.out.println(ans);
            }
        }
    }
    public static int  Bs(int[] a,int data,int low,int high) {
        while(low<=high){
            int mid =(low+high)/2;
            if(a[mid]==data){
                return mid;
            }
            if(a[mid]>data){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return -1;
        
    }
}
