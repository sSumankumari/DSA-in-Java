package TwoDArray;

public class SpiralMatrix_II {
    public static void spiralMatrix(int[][] arr){
        int startRow = 0;
        int startCol = 0;
        int endRow = arr.length-1;
        int endCol = arr[0].length-1;

        while (startRow<=endRow && startCol<=endCol){
            // Top
            for (int j=startCol; j<=endCol; j++){
                System.out.print(arr[startRow][j]+" ");
            }

            // Right
            for (int i=startRow+1; i<=endRow; i++){
                System.out.print(arr[i][endCol]+" ");
            }

            // Bottom
            for (int j=endCol-1; j>=startCol; j--){
                if (startRow == endRow){
                    break;
                }
                System.out.print(arr[endRow][j]+" ");
            }

            // Left
            for (int i=endRow-1; i>=startRow+1; i--){
                if (startCol == endCol){
                    break;
                }
                System.out.print(arr[i][startCol]+" ");
            }

            startCol++;
            startRow++;
            endCol--;
            endRow--;
        }
        System.out.println();
    }
    public static void print2DArray(int[][] arr){
        for (int i=0; i<arr.length; i++){
            for (int j=0; j<arr[0].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        print2DArray(matrix);

        System.out.println("Printing elements of matrix in spiral design: ");
        spiralMatrix(matrix);
    }
}
