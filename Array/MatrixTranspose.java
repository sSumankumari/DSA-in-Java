public class MatrixTranspose {
    public static void main(String[] args) {
        int[][] arr = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int n = arr.length;
        int m = arr[0].length;

        System.out.println("Original array: ");
        for (int i=0; i<n; i++){
            for (int j=0; j<m; j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }

        System.out.println("\nTransposed array: ");
        for (int i=0; i<m; i++){
            for (int j=0; j<n; j++){
                System.out.print(arr[j][i]+ " ");
            }
            System.out.println();
        }
    }
}
