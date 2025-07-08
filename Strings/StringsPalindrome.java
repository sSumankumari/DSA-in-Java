import java.util.Scanner;

public class StringsPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine().trim();

        String rev = "";
        int n = str.length();

        for (int i = n - 1; i >= 0; i--) {
            rev += str.charAt(i);
        }

        System.out.println("Reversed string: " + rev);

        if (str.equals(rev)) {
            System.out.println("String is palindrome");
        } else {
            System.out.println("String is not palindrome");
        }
    }
}
