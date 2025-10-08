package BitManipulation;

public class BitManipulationOperators {
    public static void main(String[] args) {
        int a = 6;
        int b = 14;
        int c = 3;
        int d = 2;

        System.out.println(a&b);
        System.out.println(a|b);
        System.out.println(a^b);
        System.out.println(~a);
        System.out.println(~b);
        System.out.println(~c);

        System.out.println(a<<c);
        System.out.println(a<<d);
        System.out.println(b>>c);
        System.out.println(b>>d);

    }
}
