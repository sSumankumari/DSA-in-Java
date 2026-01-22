package DivideNConquer;

public class MergeSort2 {
    // mergeSort --> Recursively divides the array till each array length equals 1
    public static void mergeSort(int[] arr, int start, int end){
        if (start >= end) return;

        int mid = start + (end - start) / 2;

        mergeSort(arr, start, mid);
        mergeSort(arr, mid+1, end);

        merge(arr, start, mid, end);
    }
    // merge --> It merges all sorted array by using a temp array using Two Pointers Approach
    public static void merge(int[] arr, int start, int mid, int end){
        int[] temp = new int[end - start + 1];
        int i = start; // iterator for left sorted part
        int j = mid + 1; // iterator for right sorted part
        int k = 0; // iterator for temp array

        while (i <= mid && j <= end){
            if (arr[i] < arr[j]){
                temp[k] = arr[i];
                i++;
            }
            else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        // For remaining Left unsorted part
        while (i <= mid){
            temp[k++] = arr[i++];
        }
        // For remaining right unsorted part
        while (j <= end){
            temp[k++] = arr[j++];
        }

        // Copy temp array to original array
        for (k=0, i=start; k<temp.length; k++, i++){
            arr[i] = temp[k];
        }
    }
    public static void printArray(int[] arr){
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {6, 3, 9, 5, 2, 8};
        printArray(arr);

        mergeSort(arr, 0, arr.length-1);
        printArray(arr);
    }
}
