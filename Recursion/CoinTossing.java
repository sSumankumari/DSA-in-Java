package Recursion;

import java.util.Scanner;

public class CoinTossing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        totalOutput(n,"");
    }
    public static void totalOutput(int i, String ans){
        if (i==0){
            System.out.print(ans+" ");
            return;
        }

        totalOutput(i-1, ans+"H");
        totalOutput(i-1, ans+"T");
    }
}
