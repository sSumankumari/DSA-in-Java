package Backtracking;

public class FindSubsets_Strings {
    public static void find(String str, String ans, int i){
        if (i == str.length()){
            if (ans.length() == 0){
                System.out.print("null, ");
            }
            else {
                System.out.print(ans + ", ");
            }
            return;
        }

        find(str, ans, i+1); // No choice
        find(str, ans+str.charAt(i), i+1); // Yes choice
    }
    public static void findUsingSB(String str, StringBuilder ans, int i){
        if (i == str.length()){
            if (ans.length() == 0){
                System.out.print("null, ");
            }
            else {
                System.out.print(ans + ", ");
            }
            return;
        }

        findUsingSB(str, ans.append(str.charAt(i)), i+1); // No choice
        findUsingSB(str, ans.deleteCharAt(ans.length() - 1), i+1); // Yes choice
    }
    public static void main(String[] args) {
        String str = "abc";
        System.out.println("Using String: ");
        find(str, "", 0);
        System.out.println();
        System.out.println("Using StringBuilder: ");
        findUsingSB(str, new StringBuilder(), 0);
    }
}
