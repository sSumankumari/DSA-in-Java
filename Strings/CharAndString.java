package Strings;

public class CharAndString {
    public static void main(String[] args) {
        String str = "Amity University";

        for (int i=0; i<str.length(); i++){
            char ch = str.charAt(i);

            if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                System.out.print(ch+" ");
            }
            else {
                System.out.print((int)ch+" ");
            }
        }
    }
}
