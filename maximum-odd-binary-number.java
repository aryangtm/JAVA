class Solution {
    public String maximumOddBinaryNumber(String s) {
        int z = 0;
        int o = 0;
        StringBuilder ans = new StringBuilder();
        for(char c : s.toCharArray()){
            if(c=='0')z++;
            else
            o++;
        }
        while(o!=1){ans.append(1);o--;}
        while(z!=0){ans.append(0);z--;}
        ans.append(1);
        return ans.toString();
    }
}
