package Sorting;

public class SelectionSort {
    public static int[] selectionSort(int[] a){
        for (int i = 0; i < a.length-1 ; i++) {
        int min = i;
            for (int j = i; j < a.length; j++) {
                if(a[min]>a[j]){
                    min=j;
                }
            }
            int temp = a[i];
            a[i]= a[min];
            a[min]=temp;
        }
        return a;
    }
    public static void main(String[] args) {
        int[] arr = {5,1,4,2,3};
        int[] a=selectionSort(arr);
        for(int i : a){
            System.out.print(i+" ");
        }
    }
}
