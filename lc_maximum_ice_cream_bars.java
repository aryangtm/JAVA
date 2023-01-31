class Solution {
    public int maxIceCream(int[] costs, int coins) {
     Arrays.sort(costs);
     int ci =0;
     for(int i = 0;i<costs.length&&coins>=costs[i];i++){
         coins=coins-costs[i];
            ci++;
     }
     return ci;   
    }
}
