import java.util.Scanner;

public class AbundantAndDeficit {
    public static void main(String[] args) {
        // Abundant Number:
        // In number theory, an abundant number or excessive number is a positive integer for which the sum of its proper divisors is greater than the number.
        // The integer 12 is the first abundant number. Its proper divisors are 1, 2, 3, 4 and 6 for a total of 16.

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int num = sc.nextInt();

        int fact=2;
        int factSum=1;

//        while (num>fact){
//            if (num%fact==0){
//                factSum = factSum+fact;
//            }
//            fact++;
//        }

        for (int i=2; i<num; i++){
            if (num%i==0) factSum += i;
        }
        System.out.println("Sum of divisors: "+ factSum);

        if (factSum>num) {
            System.out.println("Abundant Number");
        } else if (factSum==num) {
            System.out.println("Neutral Number");
        } else {
            System.out.println("Deficit Number");
        }
    }
}
