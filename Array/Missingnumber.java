package Array;

public class Missingnumber {
    public  static  void FindMissing(int[] arr){
        int n = arr[arr.length-1];
        int expectedSum = (n*(n+1))/2;
        int actSum=0;
        for(int i = 0; i<arr.length; i++){
            actSum+=arr[i];
        }
        int mNumber= expectedSum-actSum;
        System.out.println("missing number: "+mNumber);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,4,5,6};
        FindMissing(arr);
    }
}
