package OOPs;

public class ExceptionThrow {
    public static void main(String[] args) throws Exception{
        int age = 15;

        if (age<18) throw new Exception("You are not eligible to drive!");
        else System.out.println("You are eligible to drive!");
    }
}
