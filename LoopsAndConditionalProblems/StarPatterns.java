import java.util.Scanner;

public class StarPatterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // For Triangle pattern
        //     *
        //    **
        //   ***
        //  ****
        // *****

//        int row=5;
//        int i=1;
//        while (i<=row){
//            int j=1;
//            while (j<=row-i){
//                System.out.print("  ");
//                j++;
//            }
//            int k=1;
//            while (k<=i){
//                System.out.print("* ");
//                k++;
//            }
//            System.out.println();
//            i++;
//        }

        // Triangle or Pyramid pattern
//        int row=5;
//        int i=1;
//        while (i<=row) {
//            int j=1;
//            while (j<=row-i) {
//                System.out.print(" ");
//                j++;
//            }
//
//            int k=1;
//            while (k<=2*i-1) {
//                System.out.print("*");
//                k++;
//            }
//            System.out.println();
//            i++;
//        }


        // Inverted Triangle pattern
        // ****
        // ***
        // **
        // *
//        int row=5;
//        int i=0;
//        while (i<=row) {
//            int j=1;
//            while (j<=row-i) {
//                System.out.print("*");
//                j++;
//            }
//            System.out.println();
//            i++;
//        }


        // Number pattern
        // 1
        // 12
        // 123
        // 1234
        // 12345

//        int row=5;
//        int i=1;
//        while (i<=row){
//            int j=1;
//            while (j<=i){
//                System.out.print(j);
//                j++;
//            }
//            System.out.println();
//            i++;
//        }

        // Diamond pattern
        //     *
        //    ***
        //   *****
        //  *******
        // *********
        //  *******
        //   *****
        //    ***
        //     *

        int row=5;
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
