public class PeakIndexInMountainArray {
    public static void main(String[] args) {
        int arr[] = {3, 5, 9, 10, 11, 15, 12, 10, 7, 5, 3};
        int find = peakIndex(arr);
        System.out.println(find);
    }
    public static int peakIndex(int[] arr){
        int i=0;
        int j= arr.length-1;

        while (i<=j){
            int m = (i+j)/2;
            if (arr[m] < arr[m+1]) i=m+1;
            else j=m-1;
        }

        return i;
    }
}
