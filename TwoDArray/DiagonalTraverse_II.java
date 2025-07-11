package TwoDArray;

public class DiagonalTraverse_II {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4,5},{6,7},{8},{9,10,11},{12,13,14,15,16}};
        for (int i=0; i<arr.length; i++){
            for (int j=0; j<arr[0].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("Diagonal Traverse (Zig-Zag): ");
//        int res[] = findDiagonalOrder(arr);
//        for (int i=0; i<res.length; i++){
//            System.out.print(res[i]+" ");
//        }
    }
}
