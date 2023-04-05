import java.util.*;
public class Main
{
    public static void main(String[] args){   
	Scanner i = new Scanner(System.in);
	int x = i.nextInt();
	int sum = i.nextInt();
	int[] a = new int[x];
	for(int j = 0;j<a.length;j++)a[j]=i.nextInt();
	boolean ans = cF(a,sum);
	System.out.println(ans);
    }
    public static boolean cF(int[] a,int sum){
        HashSet<Integer> s = new HashSet<Integer>();
        for(int i = 0;i<a.length;i++){
            if(s.contains(sum-a[i]))return true;
            s.add(a[i]);
        }
        return false;
        
    }
}
