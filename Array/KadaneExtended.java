package Array;

public class KadaneExtended {
    public static void KadaneExtended(int[] arr){
        int maxSum=arr[0];
        int currSum=arr[0] , end=0, start=0, tempStart=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > currSum + arr[i]){
                currSum=arr[i];
                tempStart=i;
            }
            else{
                currSum += arr[i];
            }
            if(maxSum < currSum){
                maxSum = currSum;
                start= tempStart;
                end= i;
            }
        }
        System.out.println(maxSum);
        System.out.println(start +" "+ end);
    }
    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        KadaneExtended(arr);
    }
}
