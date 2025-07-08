package Strings;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        // Leetcode problem no. 14
        String[] strs = {"flower", "flow", "flight", "flying"};
        System.out.println("Commom prefix in all the strings is: "+ commonPrefix(strs));
    }
    public static String commonPrefix(String[] strs){
        int n = strs.length;
        String com = strs[0];

        for (int i=1; i<n; i++){
            String s = strs[i];
            int temp = 0;
            for (int j=0; j<Math.min(com.length(),s.length()); j++){
                if (s.charAt(j) != com.charAt(j)){
                    com = s.substring(0,j);
                    temp = 1;
                    break;
                }
            }

            if (temp==0) com = strs[i].length() < com.length()? strs[i]:com;
        }

        return com;
    }
}
