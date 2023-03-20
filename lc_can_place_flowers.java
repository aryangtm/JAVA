class Solution {
    public boolean canPlaceFlowers(int[] f, int n) {
        if(f.length==1&&f[0]==0)return true;
        if(n==1&&f[0]==0&&f[1]==0)return true;
        if(f[0]==0&&f[1]==0){
                f[0]=1;
                n--;
            }
            if(f[f.length-1]==0&&f[f.length-2]==0){
                f[f.length-1]=1;
                n--;
            }

        for(int i=1;i<f.length-1;i++){
           if(f[i]==0){
            if(f[i-1]==0&&f[i+1]==0){
                f[i]=1;
                n--;
            }
        }
        }
        if(n<=0)return true;
        return false;
    }
}
