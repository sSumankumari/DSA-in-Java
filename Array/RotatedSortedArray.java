public class RotatedSortedArray {
    public static int findIndexOfTarget(int arr[], int target){
        int n = arr.length;
        int low = 0;
        int high = n-1;
        while (low<=high){
            int mid = (low+high) / 2;
            if (arr[mid]==target){
                return mid;
            }
            // When left half is sorted
            else if (arr[low]<=arr[mid]){
                // When target lies in left half
                if (arr[low]<=target && target<=arr[mid]){
                    high = mid-1;
                }
                // When target lies in the right half
                else {
                    low = mid+1;
                }
            }
            // When right half is sorted
            else {
                // When target lies in right half
                if (arr[mid]<=target && target<=arr[high]){
                    low = mid+1;
                }
                else {
                    high = mid-1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        // In a rotated sorted array, the array is sorted but "rotated" at some pivot.
        // Original sorted array: [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
        // Rotated version: [6, 7, 8, 9, 0, 1, 2, 3, 4, 5]

        int[] nums = {6, 7, 8, 9, 0, 1, 2, 3, 4, 5};
        int target = 8;
        System.out.println(findIndexOfTarget(nums, target));
    }
}
