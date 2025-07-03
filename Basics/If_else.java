import java.util.Scanner;

public class If_else {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = sc.nextInt();

        if (age<10) {
            System.out.println("Not allowed to seat in front");
        } else if (age>=10 && age<=16) {
            System.out.println("Allowed to seat but can't drive");
        } else if (age>16 && age<18) {
            System.out.println("Can get learning license");
        } else if (age>18) {
            System.out.println("Allowed to drive");
        }

//        // Checking for error issues
//        int arr[] = {3, 7, 9};
//
//        // Will give error
//        if (arr[0]>5 && arr[4]>5) {
//            System.out.println("Executed");
//        }
//
//        //  Will not give error
//        if (arr[0]>5 || arr[4]>5) {
//            System.out.println("Executed");
//        }
//
//        // Will give error
//        if (arr[5]>5 || arr[0]>5) {
//            System.out.println("Executed");
//        }


        // For Nested if conditions
        int pack = 12;
        int offer = 4;

        if (pack>=700000) {
            if (offer>=3) System.out.println("Best");
            else System.out.println("Average");
        }
        else {
            if (offer>=3) System.out.println("Good");
            else System.out.println("Bad");
        }
    }
}
