class Solution {

    void printTriangle(int n) {
        int s = 1;
        for(int i = 1;i<=n;i++){
            if(i%2!=0)
            {
                s=1;
            }
            else{
                s=0;
            }
            for(int j =1;j<=i;j++){
                System.out.print(s+" ");
                s=1-s;
            }
            System.out.println();
        }
    }
}
