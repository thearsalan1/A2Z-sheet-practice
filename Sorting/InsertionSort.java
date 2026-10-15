package Sorting;

public class InsertionSort {
    public static int[] insertionSort(int[] a){
        for (int i = 0 ;  i <= a.length-1 ; i++){
            int j = i;
            while (j > 0 && a[j-1] > a[j]){
                int temp = a[j];
                a[j] = a[j-1];
                a[j-1] = temp;
                j--;
            }
        }
        return a;
    }
    public static void main(String[] args) {
        int[] arr = {5,1,4,2,3};
        int[] a = insertionSort(arr);
        for(int  i : a){
            System.out.print(i+" , ");
        }
    }
}
