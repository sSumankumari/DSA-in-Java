package Backtracking;

import java.util.ArrayList;
import java.util.List;

public class PalindromicPartitioning {
    public static void main(String[] args) {
        String s = "abab";
        List<List<String>> result = new ArrayList<>();
        partition(new ArrayList<>(), s, result);

        System.out.println(result);
    }
    public static boolean isPalindrome(String str){
        int i=0;
        int j= str.length()-1;
        while (i<j){
            if (str.charAt(i)!=str.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
    public static void partition(List<String> list, String s, List<List<String>> result){
        if (s.length() == 0){
            result.add(new ArrayList<>(list));
            return;
        }
        for (int i=1; i<=s.length(); i++){
            String str = s.substring(0,i);
            if(isPalindrome(str)){
                list.add(str);
                partition(list, s.substring(i), result);
                list.remove(list.size()-1);
            }
        }
    }
}
