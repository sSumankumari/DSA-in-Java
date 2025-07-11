package Strings;

import java.nio.file.FileAlreadyExistsException;

public class LongestPalindromicSubstring {
    public static void main(String[] args) {
        String str = "abaab";
        String ans = "";
        System.out.println(str);
        for (int i=0; i<str.length(); i++){
            for (int j=i; j<str.length(); j++){
                String s = str.substring(i, j+1);

                if (palindrome(s) == true && ans.length()<s.length()){
                    ans = s;
                }
            }
        }
        System.out.println(ans);


        // By using another method - Odd-Even center expansion technique
        String str2 = "jhdgsjbaabaabjhdsh";
        System.out.println(str2);
        System.out.println(longestPalindrome(str2));
    }
    public static boolean palindrome(String str){
        int i = 0;
        int j = str.length()-1;
        while (i<j){
            if (str.charAt(i) != str.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }

    public static String subStr(String s, int i, int j){
        while(i>=0 && j<s.length() && s.charAt(i) == s.charAt(j)){
            i--;
            j++;
        }
        return s.substring(i+1, j);
    }
    public static String longestPalindrome(String s) {
        String ans = "";
        for (int i=0; i<s.length(); i++){
            String odd = subStr(s, i, i);
            String even = subStr(s, i, i+1);

            if (odd.length() > ans.length()) ans=odd;
            if (even.length() > ans.length()) ans=even;
        }
        return ans;
    }
}
