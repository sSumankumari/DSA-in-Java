package DivideNConquer;

public class SearchInRotatedSortedArray {
    public static int search(int[] arr, int target, int start, int end) {
        if (start > end) return -1; // Invalid case

        int mid = start + (end - start) / 2;
        // Case Found
        if (arr[mid] == target){
            return mid;
        }

        // When mid lies on Line1
        if (arr[start] <= arr[mid]){
            // left part of line1
            if (arr[start]<=target && target<=arr[mid]){
                return search(arr, target, start, mid-1);
            }
            // right side after mid
            else{
                return search(arr, target, mid+1, end);
            }
        }
        // When mid lies on Line2
        else{
            // right part of line2
            if (arr[mid]<=target && target<=arr[end]){
                return search(arr, target, mid+1, end);
            }
            // left side of mid
            else{
                return search(arr, target, start, mid-1);
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;
        System.out.println("Target found at: "+ search(arr, target, 0, arr.length-1));
    }
}
