class Solution {
    public int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {
        int s = 0;
        ArrayList a = new ArrayList();
        while(numOnes>0){
            a.add(1);
            numOnes--;
        }
        while(numZeros>0){
            a.add(0);
            numZeros--;
        }
        while(numNegOnes>0){
            a.add(-1);
            numNegOnes--;
        }
        int[] ar = new int[a.size()];
        for(int i =0;i<a.size();i++)ar[i]=(int)a.get(i);
        for(int i =0;i<a.size();i++){
            if(k>0)
            s = s + ar[i];
            k--;
            }
        return s;
    }
}
