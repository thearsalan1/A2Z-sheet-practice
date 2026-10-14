package Sorting;

public class BubbleSort {
    public static int[] bubbleSort (int[] a){
        int didSwap = 0;
        for(int i=0; i<a.length-1;i++){
            for (int j =0 ; j < a.length-i-1 ; j++){
                if(a[j] > a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                    didSwap=1;
                }
            }
            if(didSwap==0){
                System.out.println("Array is sorted");
                break;
            }
        }
        return a;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5 };
        arr = bubbleSort(arr);
        for(int i : arr){
            System.out.print(i+" ");
        }
    }
}
