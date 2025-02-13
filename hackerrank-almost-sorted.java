import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'almostSorted' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void almostSorted(List<Integer> arr) {
        List<Integer> sortedArr = new ArrayList<>(arr);
        sortedArr.sort(null);
        if(arr.equals(sortedArr)){
            System.out.print("yes");
            return;
        }
        List<Integer> mismatch = new ArrayList<>();
        for(int i = 0;i<arr.size();i++){
            if(!arr.get(i).equals(sortedArr.get(i))){
                mismatch.add(i);
        }
        }
        if(mismatch.size()==2){
            int i = mismatch.get(0);
            int j = mismatch.get(1);
            int temp = arr.get(i);
            arr.set(i,arr.get(j));
            arr.set(j,temp);
            if(arr.equals(sortedArr)){
                System.out.println("yes");
                System.out.println("swap"+" "+(i+1)+" "+(j+1));
                return ;
            }
            else{
            temp = arr.get(i);
            arr.set(i,arr.get(j));
            arr.set(j,temp);
            }
        }
        int start = mismatch.get(0);
        int end = mismatch.get(mismatch.size() - 1);

        List<Integer> subarray = new ArrayList<>(arr.subList(start, end + 1));
        List<Integer> reversedSubarray = new ArrayList<>(subarray);
        Collections.reverse(reversedSubarray);

        List<Integer> newArr = new ArrayList<>(arr.subList(0, start));
        newArr.addAll(reversedSubarray);
        newArr.addAll(arr.subList(end + 1, arr.size()));

        if (newArr.equals(sortedArr)) {
            System.out.println("yes");
            System.out.println("reverse " + (start + 1) + " " + (end + 1));
            return;
        }

        System.out.println("no");
        
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.almostSorted(arr);

        bufferedReader.close();
    }
}
