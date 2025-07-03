public class MaxSumSubArray {
    public static void main(String[] args) {
        // SubArray - A contiguous sequence of elements within an array
        int arr[] = {5, -2, -4, 6, 1, 2, -9};

        int max_sum = maxSum(arr);
        System.out.println("Maximum Sum of the subarray is: "+ max_sum);
    }
    public static int maxSum(int arr[]){
        int maxSum = Integer.MIN_VALUE;

        for (int i=0; i< arr.length; i++){
            int sum=0;
            for (int j=i; j< arr.length; j++){
                sum = sum+arr[j];

                if (maxSum<sum) maxSum=sum;
            }
        }
        return maxSum;
    }
}
