import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your number: ");
        int num = sc.nextInt();
        int fact = 1;
        int sum = 0;
        while (fact<num) {
            if (num%fact==0) {
                sum = sum + fact;
            }
            fact++;
        }

        System.out.println("Sum of factors: "+ sum);

        if (sum==num) {
            System.out.println("Number is perfect");
        }
        else {
            System.out.println("Number is not perfect");
        }

    }
}
