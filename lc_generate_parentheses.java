class Solution {
    List<String> a = new ArrayList<String>();
    public List<String> generateParenthesis(int n) {
        aryan(n,0,0,"");
        return a;
    }
    void aryan(int n,int khula,int band,String s){
        if(khula==n&&band==n){
            a.add(s);
            return;
        }
        if(khula<n){
            aryan(n,khula+1,band,s+'(');
        }
        if(band<n&&band<khula){
            aryan(n,khula,band+1,s+')');
        }
    }
}
