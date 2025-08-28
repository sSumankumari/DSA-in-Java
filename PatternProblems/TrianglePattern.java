package PatternProblems;

public class TrianglePattern {
    // Floyd's Triangle
    // 1
    // 2 3
    // 4 5 6
    // 7 8 9 10
    // 11 12 13 14 15
    public static void floydTriangle(int n){
        int count = 1;
        for (int i=1; i<=n; i++){
            for (int j=1; j<=i; j++){
                System.out.print(count+" ");
                count++;
            }
            System.out.println();
        }
    }
    // 0 - 1 Triangle
    // 1
    // 0 1
    // 1 0 1
    // 0 1 0 1
    // 1 0 1 0 1
    public static void binNumTriangle(int n){
        for (int i=1; i<=n; i++){
            for (int j=1; j<=i; j++){
                if ((i+j) % 2 == 0){
                    System.out.print(1+" ");
                }
                else System.out.print(0+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        floydTriangle(5);
        binNumTriangle(6);
    }
}
