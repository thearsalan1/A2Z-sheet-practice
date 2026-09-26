package Array;

public class SecondLargestElement {
    public static void UsingArray (int[] arr){
        int secLargest = Integer.MIN_VALUE;
        int largest = Integer.MIN_VALUE;
        for (int i = 0 ; i < arr.length ; i++){
            if(arr[i]> largest){
                secLargest=largest;
                largest=arr[i];
            } else if (arr[i] > secLargest && arr[i] !=largest) {
                secLargest=arr[i];
            }
        }
        System.out.println(secLargest);
    }
    public static void main(String[] args) {
        int[] arr = {12, 45, 7, 89, 23, 56, 91, 34};
        UsingArray(arr);
    }
}
