package Strings;

public class VowelConsonant {
    public static boolean isVowel(char ch){
        return ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'
                || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U';
    }
    public static void main(String[] args) {
        String str = "_bhjg%ndj/aeeidbkjfuuuooijMiioooiiaaa";

        int vow = 0;
        int cons = 0;
        for (int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if ((ch>='A' && ch<='Z') || (ch>='a' && ch<='z')){
                if (isVowel(ch)==true){
                    vow++;
                }
                else cons++;
            }
        }

        System.out.println(str.length()+ " "+ vow +" "+ cons);
        if (vow>cons) System.out.println("Good String");
        else System.out.println("Not a good string");
    }
}
