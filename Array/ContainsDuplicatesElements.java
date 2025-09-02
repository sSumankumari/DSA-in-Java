import java.util.HashSet;

public class ContainsDuplicatesElements {
    // Brute Force Method --> O(n^2)
    public static boolean containsDuplicate(int[] arr){
        for (int i=0; i<arr.length; i++){
            for (int j=i+1; j< arr.length; j++){
                if (arr[i] == arr[j]){
                    return true;
                }
            }
        }
        return false;
    }
    // Using HashSet --> O(n)
    public static boolean containDuplicates(int[] arr){
        HashSet<Integer> set = new HashSet<>();

        for (int i=0; i<arr.length; i++){
            if (set.contains(arr[i])){
                return true;
            }
            else {
                set.add(arr[i]);
            }
        }

        return false;
    }
    public static void main(String[] args) {
        int[] nums1 = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        int[] nums2 = {1,2,3,4};

        System.out.println(containsDuplicate(nums1));
        System.out.println(containDuplicates(nums2));
    }
}
