package Recursion;

import java.util.Scanner;

public class TowerOfHanoi {
    public static void moveRings(int n, char src, char helper, char dest){
        if (n == 1){
            System.out.println("Moving ring "+ n +" from "+ src +" to "+ dest);
            return;
        }

        moveRings(n-1, src, dest, helper);
        System.out.println("Moving ring "+ n +" from "+ src +" to "+ dest);
        moveRings(n-1, helper, src, dest);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int rings = sc.nextInt();

        int rings = 4;

        char src = 'A';
        char dest = 'C';
        char helper = 'B';

        moveRings(rings, src, helper, dest);
        System.out.println();
        moveRings(3, src, helper, dest);
    }
}
