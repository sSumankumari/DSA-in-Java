package Backtracking;

public class FindPermutations_Strings {
    // Time Complexity --> O(n * n!)
    public static void find(String str, StringBuilder res){
        if (str.length() == 0){
            System.out.print(res + " ");
            return;
        }

        // Loop to traverse each char of input string
        for (int i=0; i<str.length(); i++){ // --> O(n)
            char curr = str.charAt(i);
            // remove curr character from input string
            String newStr = str.substring(0, i) + str.substring(i+1);

            res.append(curr);
            find(newStr, res); // --> O(n!)
            // Backtrack
            res.deleteCharAt(res.length() - 1);
        }
    }
    public static void main(String[] args) {
        String str = "abc";
        find(str, new StringBuilder());
        System.out.println();

        find("pqrs", new StringBuilder());
    }
}
