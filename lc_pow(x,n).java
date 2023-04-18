class Solution {
    public double myPow(double x, int n) {
        long t = n;
        double ans =1.0;
        if(t<0){
            t=-1*t;
        }
        while(t>0){
            if(t%2==0){
                x=x*x;
                t=t/2;
            }
            else{
                ans=ans*x;
                t=t-1;
            }
        }
        if(n<0){
            ans=(double)1.0/ans;
        }
        return ans;
        
    }
}
