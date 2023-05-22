class Solution {
    public String reverseWords(String s) {
        char sb[]= s.toCharArray();
        int st =0;
        for(int i =0;i<s.length();i++){
            if(s.charAt(i)==' '){
                reverseString(sb,st,i-1);
                st=i+1;
            }
        }
        reverseString(sb,st,s.length()-1);
        reverseString(sb,0,s.length()-1);
        String  a = new String(sb);
        String ans = a.replaceAll("\\s+"," ").trim();
        return ans;
    }
    public void reverseString(char[] s,int low ,int high) {
    while(low<high){
    char temp = s[low];
    s[low]=s[high];
    s[high]=temp;
    low++;
    high--;        
    }   
    }
}
