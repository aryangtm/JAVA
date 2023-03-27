class Solution {
    List<String> ans = new ArrayList<>();
    public List<String> letterCombinations(String digits) {
        if(digits.length()==0)return ans;
       String[] s ={"abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"}; 
       jaiShreeRam("",s,0,digits);
       return ans;
    }
    void jaiShreeRam(String e,String[] s,int k,String digits){
        if(e.length()==digits.length()){
            ans.add(e);
            return;
        }
        for(int i =0;i<s[digits.charAt(k)-'2'].length();i++){
            jaiShreeRam(e+s[digits.charAt(k)-'2'].charAt(i),s,k+1,digits);
        }
    }

}
