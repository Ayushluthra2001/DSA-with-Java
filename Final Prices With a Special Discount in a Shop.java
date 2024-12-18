class Solution {
    public int[] finalPrices(int[] prices) {
        
        for(int i = 0; i<prices.length; i++){
            int mini = prices[i];
            int miniIndex = i;
            for(int j = i+1; j<prices.length; j++){
                if(mini >= prices[j]){
                    mini = prices[j];
                    miniIndex =j;
                    break;
                }
            }
            if(miniIndex != i){
                prices[i] = prices[i] - mini;
            }
        }
        return prices;
    }
}
