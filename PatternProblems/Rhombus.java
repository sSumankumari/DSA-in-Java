package PatternProblems;

public class Rhombus {
    public static void solid(int n){
        for (int i=1; i<=n; i++){
            int num_space = n - i;
            for (int j=1; j<=num_space; j++){
                System.out.print(" ");
            }
            for (int j=1; j<=n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void hollow(int n){
        for (int i=1; i<=n; i++){
            int num_space = n - i;
            for (int j=1; j<=num_space; j++){
                System.out.print(" ");
            }
            for (int j=1; j<=n; j++){
                if (i==1 || i==n || j==1 || j==n){
                    System.out.print("*");
                }
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        solid(5);
        System.out.println();
        hollow(5);
    }
}
