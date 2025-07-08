package Strings;

public class ReverseStrings {
    public static String reverse(String str){
        String rev = "";
        str = str.replaceAll("\\s+", " ");
        String words[] = str.split(" ");
        for (int i=words.length-1; i>=0; i--){
            rev = rev + words[i] + " ";
        }

        return rev.trim();
    }
    public static void main(String[] args) {
        String str = "the sky is blue";
        System.out.println(reverse(str));
    }
}
