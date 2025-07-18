package Backtracking;

public class RatInAMaze {
    public static void main(String[] args) {
        int board[][] = {
                {1,0,0,0},
                {1,1,0,1},
                {1,1,0,0},
                {0,1,1,1}
        };
        // 0--> Obstacles
        // 1--> Possible Path

        find("", 0, 0, board);
    }
    public static void find(String ans, int row, int col, int[][] board){
        if (row<0 || row>=board.length || col<0 || col>=board[0].length || board[row][col]==0) return;

        if (row==board.length-1 && col==board[0].length-1){
            System.out.print(ans+" ");
            return;
        }

        board[row][col] = 0;

        // Up
        find(ans+"U", row-1, col, board);
        // Down
        find(ans+"D", row+1, col, board);
        // Left
        find(ans+"L", row, col-1, board);
        // Right
        find(ans+"R", row, col+1, board);

        // Backtrack
        board[row][col] = 1;

    }
}
