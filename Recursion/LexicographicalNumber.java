package Recursion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LexicographicalNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        List<Integer> result = new ArrayList<>();
        for (int i=1; i<=9; i++){
            create(i, n, result);
        }

        System.out.println(result);
    }
    public static void create(int n, int given_n, List<Integer> result){
        if (n>given_n) return;
        result.add(n);

        n = n*10;
        if (n>given_n) return;
        for (int i=0; i<=9; i++){
            create(n+i, given_n, result);
        }
    }
}
