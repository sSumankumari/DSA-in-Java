package Sorting;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {6, 1, 3, 8, 2, 10, 4};

        sort(0, arr.length-1, arr);
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void sort(int start, int end, int[] arr){
        if (start > end) return;

        int pi = find(start, end, arr);

        sort(start, pi-1, arr);
        sort(pi+1, end, arr);
    }
    public static int find(int start, int end, int[] arr){
        int item = arr[end];
        int pi = start;

        for (int i=start; i<end; i++){
            if (item > arr[i]){
                int temp = arr[pi];
                arr[pi] = arr[i];
                arr[i] = temp;

                pi++;
            }
        }
        int t = arr[pi];
        arr[pi] = item;
        arr[end] = t;

        return pi;
    }
}
