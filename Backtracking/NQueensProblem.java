package Backtracking;

public class NQueensProblem {
    public static boolean isSafe(int row, int col, int[][] arr){
        // Up-side
        int r = row;
        while (r>=0){
            if (arr[r][col] == 1) return false;
            r--;
        }

        // Left diagonal
        r = row;
        int c = col;
        while (r>=0 && c>=0){
            if (arr[r][c] == 1) return false;
            r--;
            c--;
        }

        // Right diagonal
        r = row;
        c = col;
        while (r>=0 && c<arr[0].length){
            if (arr[r][c] == 1) return false;
            r--;
            c++;
        }

        return true;
    }
    public static void place(int row, int queen, int[][] arr){
        if (queen==0){
            print(arr);
            return;
        }

        for (int col=0; col<arr[0].length; col++){
            if (isSafe(row, col, arr) == true){
                arr[row][col] = 1;
                place(row+1, queen-1, arr);
                arr[row][col] = 0;
            }
        }
    }
    public static void print(int[][] arr){
        for (int i=0; i<arr.length; i++){
            for (int j=0; j<arr[0].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int queen = 4;
        int[][] q_arr = new int[queen][queen];

        place(0, queen, q_arr);
    }
}
