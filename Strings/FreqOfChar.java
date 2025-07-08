package Strings;

public class FreqOfChar {
    public static void main(String[] args) {
        String str = "abaabccabaab";
        int arr[] = new int[26];

        for (int i=0; i<str.length(); i++){
            int idx = str.charAt(i) - 'a';
            arr[idx]++;
        }

        for (int i=0; i<arr.length; i++){
            if (arr[i]!=0){
                System.out.println((char)('a'+i) + " " + arr[i]);
            }
        }
    }
}
