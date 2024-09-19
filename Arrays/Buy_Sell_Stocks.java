package Arrays;
public class Buy_Sell_Stocks{
    public static int findProfit(int prices[]){
        int buyPrice = Integer.MAX_VALUE;
        int maxPrice = 0;
        for(int i=0;i<prices.length;i++){
            if(buyPrice<prices[i]){
                int profit = prices[i]-buyPrice;//selling price - buy price = profit
                maxPrice = Math.max(maxPrice, profit);
            }else{
                buyPrice = prices[i];
            }
        }
        return maxPrice;
    }
    
    public static void main(String[] args) {
        int prices[] = {7,2,10,1,5,7};
        System.out.println("Maximum profit : "+findProfit(prices));
    }
}