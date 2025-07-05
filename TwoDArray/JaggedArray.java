package TwoDArray;

public class JaggedArray {
    public static void main(String[] args) {
//        int arr[][] = {{1,3,5,7},{10,11,16,20},{7,2},{23,30,34,60,15}};
        int arr[][] = new int[4][];
        arr[0] = new int[5];
        arr[1] = new int[4];
        arr[2] = new int[2];
        arr[3] = new int[6];

        for (int i=0; i< arr.length; i++){
            for (int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
