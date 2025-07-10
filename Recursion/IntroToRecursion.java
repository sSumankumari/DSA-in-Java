package Recursion;

public class IntroToRecursion {
    public static int fact(int n){
        if (n==0 || n==1) return 1;
        int smaller = fact(n-1);
        return n*smaller;
    }
    public static int sum(int n){
        if (n==1) return 1;
        int ans = sum(n-1);
        return n+ans;
    }
    public static void main(String[] args) {
        System.out.println(fact(6));
        System.out.println(sum(10));
    }
}
