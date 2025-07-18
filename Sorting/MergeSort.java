package Sorting;

public class MergeSort {
    public static int[] sort(int start, int end, int[] arr){
        if (start == end){
            int[] a = new int[1];
            a[0] = arr[start];
            return a;
        }

        int mid = (start + end)/2;

        int[] first = sort(start, mid, arr);
        int[] second = sort(mid+1, end, arr);

        int[] merged = merge(first, second);

        return merged;
    }
    public static int[] merge(int[] arr1, int[] arr2){
        int m = arr1.length;
        int n = arr2.length;
        int[] merged = new int[m + n];

        int i1 = 0;
        int i2 = 0;
        int idx = 0;
        while (i1<m && i2<n){
            if (arr1[i1] < arr2[i2]){
                merged[idx] = arr1[i1];
                i1++;
            }
            else{
                merged[idx] = arr2[i2];
                i2++;
            }
            idx++;
        }
        while (i1 < m){
            merged[idx] = arr1[i1];
            i1++;
            idx++;
        }
        while (i2 < n){
            merged[idx] = arr2[i2];
            i2++;
            idx++;
        }

        return merged;
    }
    public static void main(String[] args) {
        int[] arr = {6, 9, 1, 5, 2, 11, 4};

        int[] sorted = sort(0, arr.length-1, arr);
        for (int i=0; i<sorted.length; i++){
            System.out.print(sorted[i]+" ");
        }
    }
}
