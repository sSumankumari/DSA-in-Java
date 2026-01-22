package DivideNConquer;

public class QuickSort2 {
    public static void quickSort(int[] arr, int start, int end){
        if (start >= end) return;

        int pivot = partition(arr, start, end);

        quickSort(arr, start, pivot-1);
        quickSort(arr, pivot+1, end);
    }
    public static int partition(int[] arr, int start, int end){
        int pivot = arr[end];
        int i = start - 1; // To make place for elements smaller than pivot

        for (int j=start; j<end; j++){
            if (arr[j] <= pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        // To place pivot element to its correct index
        int temp = pivot;
        arr[end] = arr[i];
        arr[i] = temp;

        return i;
    }
    public static void printArray(int[] arr){
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {6, 3, 9, 8, 2, 5};
        printArray(arr);

        quickSort(arr, 0, arr.length-1);
        printArray(arr);
    }
}
