class Solution {
    public String convertToTitle(int cn) {
        String ans = "";
        while(cn!=0){
            char ch = (char)((cn-1)%26+'A');
            cn=(cn-1)/26;
            ans = ch + ans;
        }
        return ans;
    }
}
