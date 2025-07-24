package TwoDArray;

public class TopDownArrayPrint {
    public static void main(String[] args) {
        int arr[][] = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        int n = arr.length;
        int m = arr[0].length;

        // Print original array
        System.out.println("Main Array:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        // Top to down and vice versa column-wise
        System.out.println("\nColumn-wise Top Down and Bottom Up:");
        for (int i = 0; i < m; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < n; j++) {
                    System.out.print(arr[j][i] + " ");
                }
            } else {
                for (int j = n - 1; j >= 0; j--) {
                    System.out.print(arr[j][i] + " ");
                }
            }
            System.out.print(" ");
        }
        System.out.println();

        // Left to right and vice versa row-wise
        System.out.println("\nRow-wise Left to Right and Right to Left:");
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < m; j++) {
                    System.out.print(arr[i][j] + " ");
                }
            } else {
                for (int j = m - 1; j >= 0; j--) {
                    System.out.print(arr[i][j] + " ");
                }
            }
            System.out.print(" ");
        }
    }
}
