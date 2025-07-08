package Strings;

public class StringSplit {
    public static void main(String[] args) {
        // Print website name, contest id & question no.
        String str = "       hacks.codingblocks.com/app/"+"contests/8283/43      ";
        System.out.println(str);

        // trim() --> used to remove white/blank spaces
        str = str.trim();
        System.out.println(str);

        // We can't split the strings by using '.', to do that use '\\.'.
        System.out.println(str.split("\\."));

        String word[] = str.split("/");
        int n = word.length;
        System.out.println("Website: "+ word[0]);
        System.out.println("Contest: "+ word[n-2]);
        System.out.println("Question: "+ word[n-1]);
    }
}
