import java.util.*;
public class Occurance_in_sorted_array {
    public static  void main(String[] args) {
        Scanner i = new Scanner(System.in);
        int x = i.nextInt();
        System.out.print("Enter the element you want to find : ");
        int data = i.nextInt();
        int[] a = new int[x];
        for (int j = 0; j < a.length; j++) {
           a[j]=i.nextInt(); 
        }
        int ans = occurance(a, data);
        System.out.println("Occurance of  element in array is : "+ans);
    }
    public static int  occurance(int[] a,int element) {
            int f = fo(a, element);
            if(f==-1){
                return 0;
            }
            else{
                return(lo(a, element)-f+1);
            }
        }
    public static int  fo(int[] a,int d) {
        int low =0;
        int high =a.length-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(a[mid]>d){
                high=mid-1;
            }
            else if(a[mid]<d){
                low=mid+1;
            }
            else{
                if(mid==0||a[mid-1]!=a[mid]){
                    return mid;
                }
                else{
                    high=mid-1;
                }
            }
        }
        return -1;
    }
    public static int lo(int[] a,int d) {
        int low=0;
        int high = a.length -1;
        while(low<=high){
            int mid = (low+high)/2;
            if(a[mid]>d){
                high=mid-1;
            }
            else if(a[mid]<d){
                low=mid+1;
            }
            else{
                if(mid==a.length-1||a[mid]!=a[mid+1]){
                    return mid;
                }
                else{
                    low=mid+1;
                }
            }
            
        }
        return 0;
    }
    
}
