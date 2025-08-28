package PatternProblems;

public class DiamondPattern2 {
    public static void solidDiamond(int n){
        for (int i=1; i<=n; i++){
            for (int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }
            for (int j=1; j<=2*i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i=n; i>=1; i--){
            for (int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }
            for (int j=1; j<=2*i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void hollowDiamond(int n){
        for (int i=1; i<=n; i++){
            for (int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }
            for (int j=1; j<=2*i-1; j++){
                if (j==1 || j==2*i-1){
                    System.out.print("*");
                }
                else System.out.print(" ");
            }
            System.out.println();
        }
        for (int i=n; i>=1; i--){
            for (int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }
            for (int j=1; j<=2*i-1; j++){
                if (j==1 || j==2*i-1){
                    System.out.print("*");
                }
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        solidDiamond(4);
        System.out.println();
        hollowDiamond(4);
    }
}
