package Array;

public class MaxConsicutiveOnes {
    public static void MaxConsOnes(int[] arr){
        int MaxCount =0;
        int currCount=0;
        for(int i =0 ; i<arr.length;i++){
            if(arr[i] == 1){
                currCount++;
            } else if (arr[i] != 1) {
                currCount=0;
            }
                MaxCount= Math.max(MaxCount,currCount);
        }
        System.out.println(MaxCount);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,1,1,2,3,4,1,1,1,3,4,1,1,1};
        MaxConsOnes(arr);
    }
}
