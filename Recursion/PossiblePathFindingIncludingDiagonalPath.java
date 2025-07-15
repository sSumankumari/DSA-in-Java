package Recursion;

public class PossiblePathFindingIncludingDiagonalPath {
    public static void main(String[] args) {
        char[][] path = {{'_','_','_','_'},
                {'_','_','X','_'},
                {'_','_','_','_'},
                {'_','X','X','_'}};
        int total = findPath("", 0, 0, path.length-1, path[0].length-1, path);
        System.out.println("\nTotal possible paths: "+ total);
    }
    public static int findPath(String ans, int cc, int cr, int dc, int dr, char[][] path){
        if (cc==dc && cr==dr){
            System.out.print(ans+" ");
            return 1;
        }
        if (cc>dc || cr>dr || path[cr][cc] == 'X') return 0;

        // Horizontal step
        int h = findPath(ans+"H", cc+1, cr, dc, dr, path);
        // Diagonal step
        int d = findPath(ans+"D", cc+1, cr+1, dc, dr, path);
        // Vertical step
        int v = findPath(ans+"V", cc, cr+1, dc, dr, path);

        return h+d+v;
    }
}
