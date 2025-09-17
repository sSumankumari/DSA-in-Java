package Sorting;

public class InsertionSort {
    public static void insertionSort(int[] arr){
        for (int i=0; i<arr.length-1; i++){
            int curr = arr[i];
            int prev = i-1;

            // Finding the correct position to insert the element
            while (prev>=0 && arr[prev] > curr){
                arr[prev+1] = arr[prev];
                prev--;
            }

            // Insert the element
            arr[prev+1] = curr;
        }
    }
    public static void printArr(int[] arr){
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {29, 10, 14, 37, 13};
        printArr(arr);

        insertionSort(arr);
        printArr(arr);
    }
}
