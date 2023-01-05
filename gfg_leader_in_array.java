class Solution{
    //Function to find the leaders in the array.
    static ArrayList<Integer> leaders(int arr[], int n){
         ArrayList<Integer> al = new ArrayList<Integer>();
        int cr=arr[n-1];
        al.add(cr);
        for(int i = n-2;i>=0;i--){
            if(cr<=arr[i]){
                al.add(arr[i]);
                cr=arr[i];
            }    
        }
        Collections.reverse(al);
        return al;
    }
}
