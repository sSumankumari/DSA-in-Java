public class BinarySearch {
    public static void main(String[] args) {
        // Binary Search:
        // It's an searching algorithm which is based on Divide and Conquer method.
        // It works on Sorted arrays only.
        // Time complexity: O(log(base2) N) --> means 32 steps
        // While Time complexity of Linear Search is O(N) --> means 10⁹ steps

        int arr[] = {2, 6, 9, 11, 44, 88};
        int target = 44;
        int index = binarySearch(arr, target);
        System.out.println(target+ " found at index no. "+ index);
    }
    public static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;

        while (start<=end){
            int mid = (start+end)/2;

            if (arr[mid] == target) return mid;
            else if (arr[mid] > target) end = mid-1;
            else start = mid+1;
        }
        return -1;
    }
}
