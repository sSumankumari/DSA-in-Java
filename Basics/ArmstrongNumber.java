import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        // Main Question: Armstrong number
        // 153 = 1**3 + 5**3 + 3**3
        Scanner sc = new Scanner(System.in);

//        System.out.print("Enter your number: ");
//        int num = sc.nextInt();
        int num = 164;

        int temp = num;
        int count = 0;
        while (temp!=0) {
            temp = temp/10;
            count++;
        }

        int sum = 0;
        temp = num;
        while (temp!=0) {
            int rem = temp%10;
            sum = sum + (int)Math.pow(rem, count);
            temp = temp/10;
        }

        if (num == sum) {
            System.out.println("Armstrong number");
        }
        else {
            System.out.println("Not an Armstrong number");
        }
    }
}
