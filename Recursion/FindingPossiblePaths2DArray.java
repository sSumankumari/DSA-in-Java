package Recursion;

public class FindingPossiblePaths2DArray {
    public static int findPath(String ans, int cc, int cr, int dc, int dr){
        if (cc==dc && cr==dr){
            System.out.print(ans+" ");
            return 1;
        }
        if (cc>dc || cr>dr) return 0;

        // Horizontal step
        int h = findPath(ans+"H", cc+1, cr, dc, dr);
        // Vertical step
        int v = findPath(ans+"V", cc, cr+1, dc, dr);

        return h+v;
    }
    public static void main(String[] args) {
        int m=4;
        int n=3;
        int cc=0;
        int cr=0;
        int dc=m-1;
        int dr=n-1;

        int total = findPath("", cc, cr, dc, dr);
        System.out.println("\nTotal no. of possible paths: "+ total);
    }
}
