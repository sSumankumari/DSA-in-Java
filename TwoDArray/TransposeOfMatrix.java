package TwoDArray;

public class TransposeOfMatrix {
    public static void main(String[] args) {
        int arr[][] = {{1,2,3,4,17,18},{5,6,7,8,19,20},{9,10,11,12,21,22},{13,14,15,16,23,24}};

        int tran[][] = transpose(arr);
        for (int i=0; i<tran.length; i++){
            for (int j=0; j<tran[0].length; j++){
                System.out.print(tran[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static int[][] transpose(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int trans[][] = new int[n][m];

        for (int i=0; i<trans.length; i++){
            for (int j=0; j<trans[0].length; j++){
                trans[i][j] = matrix[j][i];
            }
        }
        return trans;
    }
}
