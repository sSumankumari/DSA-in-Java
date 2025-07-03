import java.util.Scanner;

public class HappyNumber {
    public static void main(String[] args) {
        // Happy Number:
        // A number (positive integer) is called a happy number when it is replaced by the sum of the squares of its digits on a repeated basis until the sum of the squares of its digits equals to 1.
        // The numbers for which the process of summing up of the squares of its digits ends in 1 are happy numbers.
        // On the other hand, numbers that don’t end in 1 are called unhappy or sad numbers.
        // Example:- 23 is a happy number. Let’s see how.
        // 23 = 22 + 32 = 4 + 9 = 13 (sum of the squares of its digits)
        // 13 = 12 + 32 = 1 + 9 = 10 (sum of the squares of the digits)
        // 10 = 12 + 02 = 1 (sum of the squares of the digits)

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int num = sc.nextInt(); // 19
        int temp = 0;

        for(int i=1; i<=1000; i++){
            int sum=0;
            while (num>0){
                sum = sum + (num%10) * (num%10);
                num = num/10;
            }

            if (sum == 1) {
                temp=1;
                break;
            }
            num = sum;
        }
        System.out.println(temp==1? "Happy":"Sad");
    }
}
