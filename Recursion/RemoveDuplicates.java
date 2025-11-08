package Recursion;

public class RemoveDuplicates {
    public static void rmvDuplicates(String str, int idx, StringBuilder res, boolean map[]){
        if (idx == str.length()){
            System.out.println(res);
            return;
        }

        char curr = str.charAt(idx);
        if (map[curr - 'a'] == true){
            rmvDuplicates(str, idx+1, res, map);
        }
        else {
            map[curr - 'a'] = true;
            rmvDuplicates(str, idx+1, res.append(curr), map);
        }
    }
    public static void main(String[] args) {
        String str1 = "appnnacollege";
        rmvDuplicates(str1, 0, new StringBuilder(), new boolean[26]);

        String str2 = "cceapptdggjhdgdfgdgah";
        rmvDuplicates(str2, 0, new StringBuilder(), new boolean[26]);

        String str3 = "allaboutthistheory";
        rmvDuplicates(str3, 0, new StringBuilder(), new boolean[26]);
    }
}
