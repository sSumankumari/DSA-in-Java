package Strings;

import java.util.Scanner;

public class MaxFrequencyChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int[] arr = new int[52];

        for (int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if (ch>='a' && ch<='z'){
                int idx = ch - 'a';
                arr[idx]++;
            }
            else if (ch>='A' && ch<='Z'){
                int idx = 26 + (ch - 'A');
                arr[idx]++;
            }
        }

        int max = Integer.MIN_VALUE;
        char maxCh = ' ';
        for (int i=0; i<arr.length; i++){
            if (max<arr[i]){
                max = arr[i];
                if (i<26) maxCh = (char)('a'+i);
                else maxCh = (char)('A'+i-26);
            }
        }

        System.out.println(maxCh);
    }
}
