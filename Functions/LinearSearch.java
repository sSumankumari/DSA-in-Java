public class LinearSearch {
    public static void main(String[] args) {
        int arr[] = {1, 0, 6, -1, 3, 2, -5, 5};

        boolean found = Search(arr, 3);
        System.out.println(found);
    }
    public static boolean Search(int arr[], int target){
        int found=0;
        for (int i=0; i<arr.length; i++){
            if (arr[i] == target) return true;
        }
        return false;
    }
}
