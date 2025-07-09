package Strings;

public class AddStrings {
    public static void main(String[] args) {
        String num1 = "145";
        String num2 = "26";
        System.out.println(add(num1, num2));
    }
    public static String add(String num1, String num2){
        // Can't do this using this method bcoz digits length is upto 10000 only
//        int n1 = Integer.parseInt(num1);
//        int n2 = Integer.parseInt(num2);

        String ans = "";
        int i1 = num1.length()-1;
        int i2 = num2.length()-1;
        int carry=0;
        while (i1>=0 && i2>=0){
            int digit1 = num1.charAt(i1)-'0';
            int digit2 = num2.charAt(i2)-'0';
            ans = (digit1+digit2+carry)%10 + ans;

            carry = (digit1+digit2+carry)/10;
            i1--;
            i2--;
        }
        while (i1>=0){
            int digit1 = num1.charAt(i1)-'0';
            ans = (digit1+carry)%10+ans;
            carry = (digit1+carry)/10;
            i1--;
        }
        while (i2>=0){
            int digit2 = num2.charAt(i2)-'0';
            ans = (digit2+carry)%10+ans;
            carry = (digit2+carry)/10;
            i2--;
        }
        if (carry>0) ans = carry+ans;

        return ans;
    }
}
