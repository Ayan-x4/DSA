class Solution {
    public int maxProfit(int[] arr) {
        int mincount = arr[0];
        int BestTimetoSell = 0;
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i] < mincount ) {
                mincount = arr[i];

            }
            if(arr[i]-mincount > BestTimetoSell){
                BestTimetoSell = arr[i]- mincount;
            }


        }
        return BestTimetoSell;
        
    }
}