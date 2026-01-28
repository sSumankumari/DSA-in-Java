package Backtracking;

public class BacktrackOnArray {
    public static void changeArr(int[] arr, int idx, int val) {
        // Base case
        if (idx == arr.length){
            System.out.println("Array before backtracking: ");
            printArr(arr);
            return;
        }

        // Recursion
        arr[idx] = val;
        changeArr(arr, idx+1, val+1); // function call step
        arr[idx] = arr[idx] - 2; // Backtrack step
    }
    public static void printArr(int[] arr){
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = new int[5];
        changeArr(arr, 0, 1);
        System.out.println("Array after backtracking: ");
        printArr(arr);
    }
}
