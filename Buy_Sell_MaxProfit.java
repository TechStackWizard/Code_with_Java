public class Buy_Sell_MaxProfit{

    public static int GetMaxProfit(int prices[]){

        int buyAt = Integer.MAX_VALUE;
        int n= prices.length;
        int profit = 0;
        int maxProfit = 0;

        for(int i=0; i<n; i++){
            if(buyAt <= prices[i]){
                profit = prices[i] - buyAt;
                maxProfit = Math.max(maxProfit, profit);
            } else{
                buyAt = prices[i];

            }
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int prices[] = {7,6,1};
        int profit = GetMaxProfit(prices);
        System.out.println("Max Profit possible is : "+profit);
    }
}