class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<List<String>>();
        List<String> ds = new ArrayList<String>();
        palpart(0,s,ans,ds);
        return ans;
    }
    public static void palpart(int ind,String s,List<List<String>> ans,List<String> ds){
        if(ind==s.length()){
            ans.add(new ArrayList<>(ds));
            return ;
        }
        for(int i = ind;i<s.length();i++){
            if(cpalindrome(s,ind,i)){
                ds.add(s.substring(ind,i+1));
                palpart(i+1,s,ans,ds);
                ds.remove(ds.size()-1);
            }
        }
    }
    public static boolean cpalindrome(String s,int low,int high){
        while(low<=high){
            if(s.charAt(low++)!=s.charAt(high--)){
                return false;
            }
        }
        return true;
    }
}
