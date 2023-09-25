class Solution {
    public char findTheDifference(String s, String t) {
        int s1 =0;
        for(char c : s.toCharArray()){
            s1 = s1+c;
        }
        int s2 = 0;
        for(char c : t.toCharArray()){
            s2 = s2+c;
        }
        return (char)(s2-s1);
    }
}
