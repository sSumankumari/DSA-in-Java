package DivideNConquer;

public class MergeSort_Strings {
    public static String[] mergeSort(String[] arr, int start, int end){
        if (start == end){
            return new String[] {arr[start]};
        }

        int mid = start + (end - start) / 2;
        String[] left = mergeSort(arr, start, mid);
        String[] right = mergeSort(arr, mid+1, end);

        return merge(left, right);
    }
    public static String[] merge(String[] left, String[] right){
        int m = left.length;
        int n = right.length;

        String[] res = new String[m+n];
        int p1 = 0, p2 = 0;
        int idx = 0;

        while (p1<m && p2<n){
            if (isAlphabetSmaller(left[p1], right[p2])) {
                res[idx++] = left[p1++];
            }
            else {
                res[idx++] = right[p2++];
            }
        }

        while (p1<m){
            res[idx++] = left[p1++];
        }
        while (p2<n){
            res[idx++] = right[p2++];
        }

        return res;
    }
    public static boolean isAlphabetSmaller(String str1, String str2){
        if (str1.compareTo(str2) < 0){
            return true;
        }

        return false;
    }
    public static void main(String[] args) {
        String[] arr = {"sun", "earth", "mars", "mercury"};
        String[] a = mergeSort(arr, 0, arr.length-1);

        for (int i=0; i<a.length; i++){
            System.out.print(a[i]+" ");
        }
    }
}
