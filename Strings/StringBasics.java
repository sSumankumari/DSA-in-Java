package Strings;

public class StringBasics {
    public static void main(String[] args) {
        String str = "Amity University";

        System.out.println(str.charAt(2));
        System.out.println(str.contains("i"));

        System.out.println(str.substring(3, 8));

        String str2 = "The question is wrong";
        String words[] = str2.split(" ");
        for (int i=0; i<words.length; i++){
            System.out.print(words[i]+" ->");
        }
    }
}
