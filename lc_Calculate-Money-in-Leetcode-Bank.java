class Solution {
    public int totalMoney(int n) {
        int mondayCash = 1 ;
        int afterMondayCash = 1;
        int moneyIntheBank = 0;
        int days = 1;
        while(days<=n){
            if(days%7==0){
                moneyIntheBank += afterMondayCash;
                days++;
                mondayCash++;
                afterMondayCash = mondayCash;
            }
            if(days<=n){
                moneyIntheBank += afterMondayCash;
                afterMondayCash++;
                days++;
            }
        }
        return moneyIntheBank;

    }
}
