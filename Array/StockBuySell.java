package Array;

public class StockBuySell {
    public static void function (int[] arr){
        int minPrice = Integer.MAX_VALUE;
        int maxProfit= 0;
        for(int num : arr){
            if(num< minPrice){
                minPrice = num;
            }
            else if(num-minPrice > maxProfit){
                maxProfit = num -minPrice;
            }
        }
        System.out.println(maxProfit);
    }
    public static void main(String[] args) {
        int[] arr = {7,1,5,3,6,4};
        function(arr);
    }
}
