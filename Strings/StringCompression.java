package Strings;

public class StringCompression {
    public static String compress(String str){
        StringBuilder res = new StringBuilder();

        for (int i=0; i<str.length(); i++){
            // Using Integer instead of int because we have to convert this int value into string
            Integer count = 1;
            while (i < str.length()-1 && str.charAt(i) == str.charAt(i+1)){
                count++;
                i++;
            }
            res.append(str.charAt(i));

            if (count > 1){
                res.append(count.toString());
            }
        }

        return res.toString();
    }
    public static void main(String[] args) {
        String str1 = "abc";
        System.out.println(compress(str1));

        String str2 = "aaaabbaabacccd";
        System.out.println(compress(str2));

        String str3 = "aaabbbccc";
        System.out.println(compress(str3));

    }
}
