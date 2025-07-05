import java.util.Scanner;

public class OddEvenCarProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your car number to check whether it can run on Sunday: ");
        int n = sc.nextInt();
        int temp=n;

        int oddSum = 0;
        int evenSum = 0;
        while (temp!=0){
            int digit=temp%10;
            if (temp%2==0) {
                evenSum = evenSum + digit;
            } else {
                oddSum = oddSum + digit;
            }
            temp = temp/10;
        }

        if (evenSum!=0 && evenSum%4==0 || oddSum!=0 && oddSum%3==0) {
            System.out.println("Allowed to run");
        }
        else {
            System.out.println("Not allowed to run");
        }
    }
}
