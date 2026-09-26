package Array;

public class CheckArrayIsSorted {
    public static void UsingArray(int[] arr){
        int i=0;
        while(arr.length-1 > i){
            if(arr[i] > arr[i+1]){
                System.out.println("Not sorted");
                return;
            }
            i++;
        }
        System.out.println("Sorted");
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6, 1};
        UsingArray(arr);
    }
}
