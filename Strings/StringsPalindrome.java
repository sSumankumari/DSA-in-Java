import java.util.Scanner;

public class StringsPalindrome {
    public static boolean isPalindrome(String str){
        for (int i=0; i<str.length()/2; i++){
            int n = str.length();
            if (str.charAt(i) != str.charAt(n-1-i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter a string: ");
//        String str = sc.nextLine().trim();

        String str = "ababaaaa";
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

        String str1 = "ababaabaababa";
        String str2 = "abababcababab";

        System.out.println(isPalindrome(str));
        System.out.println(isPalindrome(str1));
        System.out.println(isPalindrome(str2));

    }
}
