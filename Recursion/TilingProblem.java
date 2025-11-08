package Recursion;

public class TilingProblem {
    public static int tiling(int n){
        if (n==0 || n==1){
            return 1;
        }

        // For vertical choice
        int v = tiling(n-1);
        // For Horizontal choice
        int h = tiling(n-2);

        return (v+h);
    }
    public static void main(String[] args) {
        System.out.println(tiling(3));
        System.out.println(tiling(4));
        System.out.println(tiling(10));
        System.out.println(tiling(7));
    }
}
