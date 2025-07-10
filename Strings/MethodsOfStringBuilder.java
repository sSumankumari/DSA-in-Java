package Strings;

public class MethodsOfStringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("Amity");
        System.out.println(sb);

        sb.insert(2, "Un");
        System.out.println(sb);

        sb.replace(0, 1, "Our");
        System.out.println(sb);
    }
}
