package TwoDArray;

import javax.imageio.ImageTranscoder;

public class SearchInSortedMatrix {
    public static boolean staircaseSearchFromTopRight(int[][] arr, int key){
        int row = 0;
        int col = arr[0].length-1;
        while (row<arr.length && col>=0){
            if (arr[row][col] == key){
                System.out.println("Key found at ("+ row + ","+ col +")");
                return true;
            }
            else if (key < arr[row][col]){
                // Move left side
                col--;
            }
            else {
                // Move bottom side
                row++;
            }
        }
        System.out.println("Key not found!");

        return false;
    }

    public static boolean staircaseSearchFromBottomLeft(int[][] arr, int key){
        int row = arr.length-1;
        int col = 0;
        while (row>=0 && col<arr[0].length){
            if (arr[row][col] == key){
                System.out.println("Key found at ("+ row + ","+ col +")");
                return true;
            }
            else if (key < arr[row][col]){
                // Move top side
                row--;
            }
            else {
                // Move right side
                col++;
            }
        }
        System.out.println("Key not found!");

        return false;
    }

    public static void main(String[] args) {
        int[][] matrix = {{10,20,30,40},{15,25,35,45},{27,29,37,48},{32,33,39,50}};
        int key1 = 33;

        staircaseSearchFromTopRight(matrix, key1);

        int key2 = 55;
        staircaseSearchFromBottomLeft(matrix, key1);
        staircaseSearchFromBottomLeft(matrix, key2);

    }
}
