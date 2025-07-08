package Strings;

public class CharFreqCountPrinting {
    public static void main(String[] args) {
        String str = "aaabbcdffgii";

        int i = 0;
        while (i<str.length()) {
            int count = i;
            while (count<str.length() && str.charAt(i) == str.charAt(count)) {
                count++;
            }
            System.out.print(str.charAt(i) + "" + (count-i) + " ");
            i = count;
        }
    }
}
