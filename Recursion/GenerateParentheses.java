package Recursion;

public class GenerateParentheses {
    public static void main(String[] args) {
        int n=3;
        int o=0;
        int c=0;

        int total = findParentheses("", o, c, n);
        System.out.println("Total generated parentheses: "+ total);
    }
    public static int findParentheses(String ans, int o, int c, int n){
        if (o==n & c==n){
            System.out.print(ans+" ");
            return 1;
        }

        int open=0, close=0;
        if (o<n){
            open = findParentheses(ans+"(", o+1, c, n);
        }
        if (o>c){
            close = findParentheses(ans+")", o, c+1, n);
        }

        return open+close;
    }
}
