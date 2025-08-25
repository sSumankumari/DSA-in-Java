package PatternProblems;

import java.util.Scanner;

public class DiamondPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of rows: ");
        int row = sc.nextInt();
//        int row=5;
        int i=1;
        while (i<=row) {
            int j=1;
            while (j<=row-i) {
                System.out.print(" ");
                j++;
            }

            int k=1;
            while (k<=2*i-1) {
                System.out.print("*");
                k++;
            }
            System.out.println();
            i++;
        }

        i = row-1;

        while (i>=1) {
            int j=1;
            while (j<=row-i) {
                System.out.print(" ");
                j++;
            }

            int k=1;
            while (k<=2*i-1) {
                System.out.print("*");
                k++;
            }
            System.out.println();
            i--;
        }
    }
}
