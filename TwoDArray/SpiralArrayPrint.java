package TwoDArray;

public class SpiralArrayPrint {
    public static void main(String[] args) {
        int arr[][] = {
                { 1,  2,  3,  4,  5,  6},
                { 7,  8,  9, 10, 11, 12},
                {13, 14, 15, 16, 17, 18},
                {19, 20, 21, 22, 23, 24},
                {25, 26, 27, 28, 29, 30},
                {31, 32, 33, 34, 35, 36}
        };

        int n = arr.length;
        int m = arr[0].length;

        int top = 0;
        int bottom = n - 1;
        int left = 0;
        int right = m - 1;

        System.out.println("Spiral Order Traversal:");
        while (top <= bottom && left <= right) {
            // Print top row
            for (int i = left; i <= right; i++) {
                System.out.print(arr[top][i] + " ");
            }
            top++;

            // Print right column
            for (int i = top; i <= bottom; i++) {
                System.out.print(arr[i][right] + " ");
            }
            right--;

            // Print bottom row (if still valid)
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    System.out.print(arr[bottom][i] + " ");
                }
                bottom--;
            }

            // Print left column (if still valid)
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    System.out.print(arr[i][left] + " ");
                }
                left++;
            }
        }
    }
}
