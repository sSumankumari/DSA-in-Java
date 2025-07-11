package Recursion;

public class StringSubsequences {
    public static void main(String[] args) {
        // Using Backtracking Method
        String str = "abc";
        subsequence(str, 0, "");
    }
    public static void subsequence(String s, int i, String ans){
        if (i == s.length()){
            System.out.print(ans+". ");
            return;
        }

        // To include the string
        subsequence(s, i+1, ans+s.charAt(i));
        // To exclude the string
        subsequence(s, i+1, ans);
    }
}
