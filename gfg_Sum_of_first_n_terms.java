class Solution {
    long sumOfSeries(long N) {
        if(N==0)return 0;
        long sum = sumOfSeries(N-1);
        sum=sum+N*N*N;
        return sum;
    }
}
