import java.util.Scanner;

public class BostonNumber {
    public static void main(String[] args) {
        // Boston Number:-
        // A Boston number is a composite number, the sum of whose digits is the sum of the digits of its prime factors obtained as a result of prime factorization (excluding 1 ).
        // The first few such numbers are 4,22 ,27 ,58 ,85 ,94 and 121 .
        // For example, 378 = 2 × 3 × 3 × 3 × 7 is a Boston number since 3 + 7 + 8 = 2 + 3 + 3 + 3 + 7.
        // Write a program to check whether a given integer is a Boston number.

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int num = sc.nextInt();

        int temp = num;
        int fact=2;
        int factSum=0;

        // Factor Sum
        while (temp>1){
            if(temp%fact==0){
                int tempFact = fact;
                while (tempFact > 0){
                    int digit = tempFact%10;
                    factSum = factSum + digit;
                    tempFact = tempFact/10;
                }
                temp = temp/fact;
            }
            else fact++;
        }
        System.out.println("Factors Sum: "+ factSum);

        // Digits Sum
        temp = num;
        int digitSum=0;

        while (temp>0){
            int digit = temp%10;
            digitSum = digitSum + digit;
            temp = temp/10;
        }

        System.out.println("Digits Sum: "+ digitSum);

        System.out.println(digitSum==factSum?"Boston" : "Not Boston");
    }
}
