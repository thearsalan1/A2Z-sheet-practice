package Array;

public class KadanesAlgi {
    public static void KadanesAlgo(int[] arr){
        int currentSum = 0;
        int maxSum=0;
        for (int i = 0; i < arr.length; i++) {
            currentSum = Math.max(arr[i],currentSum+arr[i]);
            maxSum= Math.max(currentSum,maxSum);
        }
        System.out.println(maxSum);
    }

    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        KadanesAlgo(arr);
    }
}
