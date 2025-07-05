package TwoDArray;

public class TopDownArrayPrint {
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

        System.out.println("Array traversed from top to down and vice varsa: ");
        for (int i=0; i<m; i++){
            if (i%2==0){
                for (int j=0; j<n; j++){
                    System.out.print(arr[j][i]+ " ");
                }
            }
            else {
                for (int j=n-1; j>=0; j--){
                    System.out.print(arr[j][i]+ " ");
                }
            }
            System.out.println();
        }
    }
}
