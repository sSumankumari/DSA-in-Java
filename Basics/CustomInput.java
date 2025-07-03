import java.util.Scanner;

public class CustomInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        System.out.println("Enter number of rows: ");
//        int row = sc.nextInt();
//
//        int i=1;
//        while (i<=row) {
//            int j=1;
//            while (j<=i) {
//                System.out.print("*\t");
//                j++;
//            }
//            System.out.println();
//            i++;
//        }

        // Finding prime factors
//        System.out.println("Enter your number: ");
//        int num = sc.nextInt();
//        int fact = 2;
//        System.out.println("Factors of "+ num + " are: ");
//        while (num>1) {
//            if (num%fact==0) {
//                System.out.print(fact + "\t");
//                num = num / fact;
//            }else {
//               fact++;
//            }
//        }

        // Counting digits in a number
//        System.out.println("Enter your number: ");
//        int num = sc.nextInt();
//        int count=0;
//        while (num!=0) {
//            num = num/10;
//            count++;
//        }
//        System.out.println("Count digits: "+ count);

        // Finding sum of digits in a number
        System.out.println("Enter your number: ");
        int num = sc.nextInt();
        int sum = 0;
        while (num!=0) {
            int rem = num%10;
            sum = sum+rem;
            num = num/10;
        }
        System.out.println("Sum of digits: "+ sum);
    }
}
