package Sorting;

public class MergeTwoSortedArrays {
    public static void main(String[] args) {
        int[] arr1 = {1,7,11,21,29};
        int[] arr2 = {2,5,6,13,20};

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

        for (int i=0; i<merged.length; i++){
            System.out.print(merged[i]+" ");
        }
    }
}
