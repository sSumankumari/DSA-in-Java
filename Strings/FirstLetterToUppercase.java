package Strings;

public class FirstLetterToUppercase {
    public static String toUpperCase(String str){
        StringBuilder sb = new StringBuilder();

        // For letter at 0th index
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        for (int i=1; i<str.length(); i++){
            if (str.charAt(i)==' ' && i<str.length()-1){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }
            else {
                sb.append(str.charAt(i));
            }
        }

        return sb.toString();
    }
    public static void main(String[] args) {
        String str = "This is a beautiful day";
        System.out.println(toUpperCase(str));

        String str1 = "Hello! welcome to the Java programming world";
        System.out.println(toUpperCase(str1));
    }
}
