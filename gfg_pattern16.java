class Solution {

    void printTriangle(int n) {
        char a = 'A';
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=i;j++){
                System.out.print(a);
            }
            a++;
            System.out.println();
        }
    }
}
