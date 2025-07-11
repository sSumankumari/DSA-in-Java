package Recursion;

public class TargetOccuranceIndex {
    public static void main(String[] args) {
        int arr[] = {6, 2, 9, 1, 9, 6, 2, 3, 1, 2, 1};
        int target = 6;
        int n = arr.length - 1;
        System.out.println(findFirst(arr, 0, target));
        System.out.println(findLast(arr, n, target));
    }
    public static int findFirst(int[] arr, int i, int target){
        if (i>= arr.length) return -1;
        if (arr[i] == target) return i;
        int f = findFirst(arr, i+1, target);
        return f;
    }
    public static int findLast(int[] arr, int i, int target){
        if (i<0) return -1;
        if (arr[i] == target) return i;
        int f = findLast(arr, i-1, target);
        return f;
    }
}
