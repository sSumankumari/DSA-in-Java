package TwoDArray;

public class DiagonalSum {
    public static int diagSumBrute(int[][] arr){
        int sum = 0;
        for (int i=0; i<arr.length; i++){
            for (int j=0; j<arr[0].length; j++){
                if (i == j){
                    sum += arr[i][j];
                }
                else if (i+j == arr.length-1){
                    sum += arr[i][j];
                }
            }
        }

        return sum;
    }
    public static int diagSum(int[][] arr){
        int sum = 0;
        int n = arr.length;

        for (int i=0; i<n; i++){
            sum += arr[i][i];

            if (i != n-1-i){
                sum += arr[i][n-1-i];
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        int[][] matrix1 = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};

        System.out.println("Printing the sum of diagonal elements (using Brute force method): ");
        System.out.println(diagSumBrute(matrix1));

        int[][] matrix2 = {{0,1,2},{3,4,5},{6,7,8}};
        System.out.println("Printing the sum of diagonal elements (using optimized method): ");
        System.out.println(diagSum(matrix2));
    }
}
