package Sorting;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {29, 10, 14, 37, 13};
        int n = arr.length;

        for (int i=0; i<n-1; i++) {
            int minIndex = i;

            for (int j=i+1; j<n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            if (minIndex != i) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }

        System.out.println("Sorted array:");
        for (int i=0; i<n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
