package OOPs;

public class Polymorphism {
    public static int sum(int a, int b){
        return a+b;
    }
    public static double sum(double a, double b){
        return a+b;
    }
    public static int sum(int a, int b, int c){
        return a+b+c;
    }
    public static void main(String[] args) {
        int sum1 = sum(2, 3);
        System.out.println(sum1);
        double sum2 = sum(2.2, 6.8);
        System.out.println(sum2);
        int sum3 = sum(12, 22, 6);
        System.out.println(sum3);
    }
}
