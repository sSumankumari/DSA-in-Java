package Strings;

public class CountUppercase {
    public static void main(String[] args) {
        String str = "aAbBCdA";
        int count=0;
        for (int i=0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int ascii = (int) ch;
            if (ascii>=65 && ascii<=90) {
                count++;
            }
        }

        System.out.println("No. of uppercase letters occured: "+ count);
    }
}
