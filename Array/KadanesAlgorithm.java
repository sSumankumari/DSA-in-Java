public class KadanesAlgorithm {
    public static void main(String[] args) {
        // Kadanes Algorithm - Used to find the maximum sum of the subarray
        int arr[] = {1, 4, -4, 5, -10, 1};
        int max_sum = Integer.MIN_VALUE;
        int sum=0;
        for (int i=0; i<arr.length; i++){
            sum = sum+arr[i];
            if (sum>max_sum) max_sum=sum;
            if (sum<0) sum=0;
        }

        System.out.println(max_sum);
    }
}
