import java.util.* ;
import java.io.*; 
public class Solution {
    public static ArrayList<Integer> subsetSum(int num[]) {
        ArrayList<Integer> ans = new ArrayList<Integer>(num.length);
       com(num, 0, 0, ans);
       Collections.sort(ans);
       return ans;
    }
    public static void com(int[] num,int sum,int ind, ArrayList<Integer> ans){
        if(num.length==ind){
            ans.add(sum);
            return;
        }
        com(num,sum+num[ind],ind+1,ans);
        com(num,sum,ind+1,ans);
    }

}
