import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int num = sc.nextInt();
//        int num = 13231;
        int cur = num;
        int rev = 0;

        while (num>0){
            int digit = num%10;
            rev = rev*10 + digit;
            num = num/10;
        }
        System.out.println("Reversed number: "+ rev);

        if (cur == rev) {
            System.out.println("Palindrome number");
        }
        else {
            System.out.println("Not a palindrome number");
        }
    }
}
