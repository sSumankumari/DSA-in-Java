package Recursion;

public class LetterCombinationsOfPhoneNumber {
    public static void main(String[] args) {
        String[] container = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        findCombintaions("", 0, "23", container);
    }
    public static void findCombintaions(String ans, int idx, String digits, String[] key) {
        if (idx == digits.length()){
            System.out.print(ans+" ");
            return;
        }

        int d = digits.charAt(idx) - '0';
        String s= key[d];

        for (int i=0; i<s.length(); i++){
            findCombintaions((ans+s.charAt(i)), idx+1, digits, key);
        }
    }
}
