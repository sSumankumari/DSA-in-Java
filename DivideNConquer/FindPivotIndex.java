package Sorting;

public class FindPivotIndex {
    public static void main(String[] args) {
        int arr[] = {7,5,1,3,9,4};

        int pi = find(0, arr.length-1, arr);
        System.out.println(pi);

        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
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
