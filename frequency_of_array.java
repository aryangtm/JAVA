import java.util.*;
public class Main
{
    public static void main(String[] args){   
	Scanner i = new Scanner(System.in);
	int x = i.nextInt();
	int[] a = new int[x];
	for(int j = 0;j<a.length;j++)a[j]=i.nextInt();
        fRequency(a);
    }
    public static void fRequency(int[] a){
        HashMap<Integer,Integer> s = new HashMap<>();
        for(int x : a){
            s.put(x,s.getOrDefault(x,0)+1);
        }
        for(Map.Entry<Integer,Integer> e : s.entrySet() ){
            System.out.println(e.getKey()+" Frequency =  "+e.getValue());
        } 
    }
}
