package TwoDArray;

public class DiagonalPrint {
    public static void main(String[] args) {
        int arr[][] = {{1,2,3,4,17,18},{5,6,7,8,19,20},{9,10,11,12,21,22},{13,14,15,16,23,24}};
        int n = arr.length;
        int m = arr[0].length;
        System.out.println("Main Array: ");
        for (int i=0; i<n; i++){
            for (int j=0; j<m; j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }

        System.out.println("Diagonal Elements Print(based on row increment): ");
        for (int row=0; row<n; row++){
            int r=row;
            int c=0;

            while (r>=0 && c<m){
                System.out.print(arr[r][c]+" ");
                r--;
                c++;
            }
            System.out.println();
        }

        for (int col=1; col<m; col++){
            int r=n-1;
            int c=col;

            while (c<m && r>=0){
                System.out.print(arr[r][c]+" ");
                r--;
                c++;
            }
            System.out.println();
        }

        System.out.println("Diagonal Elements Print(based on column increment): ");
//        for (int col=0; col<m; col++){
//            int r=0;
//            int c=col;
//
//            while (r>=0 && c<m){
//                System.out.print(arr[c][r]+" ");
//                r--;
//                c++;
//            }
//            System.out.println();
//        }
//
//        for (int row=1; row<n; row++){
//            int r=row;
//            int c=m-1;
//
//            while (c<m && r>=0){
//                System.out.print(arr[c][r]+" ");
//                r--;
//                c++;
//            }
//            System.out.println();
//        }
    }
}
