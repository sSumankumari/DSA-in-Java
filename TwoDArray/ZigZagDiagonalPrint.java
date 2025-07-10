package TwoDArray;

import java.util.Scanner;

public class ZigZagDiagonalPrint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] arr = new int[m][n];

        for (int i=0; i<m; i++){
            for (int j=0; j<n; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        for (int d=0; d < (m+n)-1; d++) {
            if (d%2 == 0) {
                // To move up-right (↗)
                int r = (d<m) ? d : m-1;
                int c = d-r;

                while (r>=0 && c<n) {
                    System.out.print(arr[r][c] + " ");
                    r--;
                    c++;
                }

            } else {
                // To move down-left (↙)
                int c = (d<n) ? d : n-1;
                int r = d-c;

                while (r<m && c>=0) {
                    System.out.print(arr[r][c] + " ");
                    r++;
                    c--;
                }
            }
            System.out.println();
        }
    }
}
