package Array;

public class AlternatingPosNDNeg {
    public static void AlterPnN(int[] arr) {
        int n = arr.length;
        int[] pos = new int[n];
        int[] neg = new int[n];
        int p = 0, q = 0;

        for (int num : arr) {
            if (num >= 0) pos[p++] = num;
            else neg[q++] = num;
        }

        int i = 0, j = 0, k = 0;
        while (i < p && j < q) {
            arr[k++] = pos[i++];
            arr[k++] = neg[j++];
        }

        while (i < p) arr[k++] = pos[i++];
        while (j < q) arr[k++] = neg[j++];

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, -4, -1, 4};
        AlterPnN(arr);
    }
}
