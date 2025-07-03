import java.util.*;
public class Loop {
    public static void main(String[] args) {
        // Even numbers till 100
        int i = 1;
        while (i<=100) {
            if (i%2 == 0) System.out.println(i);
            i++;
        }

        // Number divisible by 2, 3 & 7
//        int num=1;
//        while (num <= 1000) {
//            if (num%2==0 && num%3==0 && num%7==0) {
//                System.out.println(num);
//            }
//            num++;
//        }

        // Table from 1-10
//        while (num<=10) {
//            int mul=1;
//            while (mul<=10) {
//                int res = num * mul;
//                System.out.print(res + " ");
//                mul++;
//            }
//            System.out.println();
//            num++;
//        }

        // For rectangle pattern
//        int i = 1;
//        while (i<=5) {
//            int j = 1;
//            while (j<=5) {
//                System.out.print("*");
//                j++;
//            }
//            System.out.println();
//            i++;
//        }

        // Fibonacci Series
//        int n = 2;
//        int first = 0, second = 1;
//
//        System.out.print("Fibonacci Series up to " + n + " terms: ");
//
//        while (n<=15) {
//            System.out.print(first + "\t");
//
//            int sum = first + second;
//            first = second;
//            second = sum;
//
//            n++;
//        }

        // For Right Angle triangle pattern
//        int i = 1;
//        while (i<=5) {
//            int j = 1;
//            while (j<=i) {
//                System.out.print("*");
//                j++;
//            }
//            System.out.println();
//            i++;
//        }

    }
}
