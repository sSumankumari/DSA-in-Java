package Strings;

import java.nio.file.FileAlreadyExistsException;

public class LongestPalindromicSubstring {
    public static void main(String[] args) {
        String str = "abaab";
        String ans = "";
        for (int i=0; i<str.length(); i++){
            for (int j=i; j<str.length(); j++){
                String s = str.substring(i, j+1);

                if (palindrome(s) == true && ans.length()<s.length()){
                    ans = s;
                }
            }
        }
        System.out.println(ans);
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
}
