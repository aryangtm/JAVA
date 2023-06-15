class Solution {

    void printTriangle(int n) {
        for(int i = n;i>=1;i--){
            for(char c = 'A';c<'A'+i;c++){
                System.out.print(c);
            }
            System.out.println();
        }
    }
}
