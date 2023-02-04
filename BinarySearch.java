import java.util.*;
class BinarySearch{
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int x = i.nextInt();
        int[] a = new int[x];
        System.out.print("Enter the element you want to search : ");
        int data = i.nextInt();
        for (int j = 0; j < x ; j++) {
            a[j]=i.nextInt();
        }
        int ans = BinSea(a,data);
        System.out.println(ans);

    }
    static int BinSea(int[] a,int data){
        int l = 0;
        int high = a.length-1;
        while(l<=high){
            int mid = (l+high)/2;
            if(a[mid]==data)
                return mid;
            if(a[mid]>data)
                high=mid-1;
            else
                l=mid+1;
        }
        return -1;
    }
}
