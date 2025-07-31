package Stack;

import java.util.Stack;

public class ValidParentheses {
    public static boolean isValid(String s){
        Stack<Character> st = new Stack<>();

        for (int i=0; i<s.length(); i++){
            char ch = s.charAt(i);

            if (ch==')' || ch=='}' || ch==']'){
                if (st.isEmpty()) return false;
                char c = (char) st.pop();

                if ((ch==')' && c=='(') || (ch=='}' && c=='{') || (ch==']' && c=='[')){
                    continue;
                }
                else return false;
            }
            else {
                st.push(ch);
            }
        }

        return st.isEmpty();
    }
    public static void main(String[] args) {
        String str1 = "{[()]}";
        String str2 = "{[()]]";
        String str3 = "{[()]}(";

        System.out.println(isValid(str1));
        System.out.println(isValid(str2));
        System.out.println(isValid(str3));

    }
}
