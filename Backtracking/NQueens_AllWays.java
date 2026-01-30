package Backtracking;

public class NQueens_AllWays {

    public static boolean isSafe(char[][] board, int row, int col) {

        // 🔒 Guard clause (prevents ANY out-of-bound access)
        if (row < 0 || row >= board.length || col < 0 || col >= board.length) {
            return false;
        }

        // Vertical Up
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'Q') return false;
        }

        // Left Diagonal Up
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') return false;
        }

        // Right Diagonal Up
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q') return false;
        }

        return true;
    }

    static int count = 0;
    public static void nQueens(char[][] board, int row) {

        // Base case
        if (row == board.length) {
            printBoard(board);
            count++;
            return;
        }

        // Try placing queen in every column
        for (int col = 0; col < board.length; col++) {
            if (isSafe(board, row, col)) {
                board[row][col] = 'Q';
                nQueens(board, row + 1);
                board[row][col] = '.'; // backtrack
            }
        }
    }

    public static void printBoard(char[][] board) {
        System.out.println("Chess Board:");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int n = 4;
        char[][] board = new char[n][n];

        // Initialize board
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }

        nQueens(board, 0);
        System.out.println("Total no. of ways to solve: "+ count);
    }
}
