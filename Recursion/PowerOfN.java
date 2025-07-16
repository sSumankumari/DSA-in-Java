package Recursion;

import java.util.Scanner;

public class PowerOfN {
    public static long power(int n, int p){
        if (p==1) return n;
        long res = power(n, p/2);
        if (p%2==0){
            return res*res;
        }
        else {
            return res*res*n;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = sc.nextInt();

        System.out.println(power(n, p));
    }
}
