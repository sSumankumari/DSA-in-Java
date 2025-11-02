package Recursion;

import java.util.Scanner;

public class PowerOfN {
    public static long power(int n, int p){
        if (p==0) return 1;
        long res = n * power(n, p-1);
        return res;
    }
    public static long powerOptimized(int x, int p){
        if (p==0) return 1;
        long res = powerOptimized(x, p/2) * powerOptimized(x, p/2);

        if (p%2 != 0){
            res = x * res;
        }

        return res;
    }
    public static long powerMoreOptimized(int x, int p){
        if (p==0) return 1;
        long halfPower = powerMoreOptimized(x, p/2);
        long res = halfPower * halfPower;

        if (p%2 != 0){
            res = x * res;
        }

        return res;
    }
    public static void main(String[] args) {
        System.out.println(power(2, 10));
        System.out.println(power(2, 7));

        System.out.println(powerOptimized(5, 6));
        System.out.println(powerOptimized(5, 3));

        System.out.println(powerMoreOptimized(4, 5));
        System.out.println(powerMoreOptimized(4, 6));
    }
}
