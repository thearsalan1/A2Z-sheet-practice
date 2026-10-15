package Sorting;

public class MergeSort {

    public static void mergeSort(int[] a, int low, int high) {

        if (low >= high)
            return;

        int mid = low + (high - low) / 2;

        mergeSort(a, low, mid);
        mergeSort(a, mid + 1, high);

        merge(a, low, mid, high);
    }

    public static void merge(int[] a, int low, int mid, int high) {

        int[] left = new int[mid - low + 1];
        int[] right = new int[high - mid];

        for (int i = 0; i < left.length; i++) {
            left[i] = a[low + i];
        }

        for (int i = 0; i < right.length; i++) {
            right[i] = a[mid + 1 + i];
        }

        int i = 0, j = 0, k = low;

        while (i < left.length && j < right.length) {

            if (left[i] <= right[j]) {
                a[k++] = left[i++];
            } else {
                a[k++] = right[j++];
            }
        }

        while (i < left.length) {
            a[k++] = left[i++];
        }

        while (j < right.length) {
            a[k++] = right[j++];
        }
    }

    public static void main(String[] args) {

        int[] arr = {5, 1, 4, 2, 3};

        mergeSort(arr, 0, arr.length - 1);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}