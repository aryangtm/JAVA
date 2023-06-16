class Solution {

    void printGfg(int N) {
        if(N<1)return;
        printGfg(N-1);
        System.out.print("GFG ");
    }
}
