package TwoDArray;

import java.util.Scanner;

public class ZigZagDiagonalPrint {
    public static int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int[] res = new int[m*n];

        int idx = 0;
        for (int i=0; i<m+n-1; i++){
            if (i%2==0){
                int r = (i<m)? i:m-1;
                int c = i-r;
                while (r>=0 && c<n){
                    res[idx++] = mat[r][c];
                    r--;
                    c++;
                }
            }
            else {
                int c = (i<n)? i:n-1;
                int r = i-c;
                while (r<m && c>=0){
                    res[idx++] = mat[r][c];
                    r++;
                    c--;
                }
            }
        }

        return res;
    }
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        for (int i=0; i<arr.length; i++){
            for (int j=0; j<arr[0].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("Diagonal Traverse (Zig-Zag): ");
        int res[] = findDiagonalOrder(arr);
        for (int i=0; i<res.length; i++){
            System.out.print(res[i]+" ");
        }
    }
}
