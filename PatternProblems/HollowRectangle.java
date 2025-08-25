package PatternProblems;

public class HollowRectangle {
    public static void hollowRect(int rows, int cols){
        for (int i=1; i<=rows; i++){
            for (int j=1; j<=cols; j++){
                if (i==1 || i==rows || j==1 || j==cols){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        hollowRect(5,8);
        hollowRect(10, 6);
    }
}
