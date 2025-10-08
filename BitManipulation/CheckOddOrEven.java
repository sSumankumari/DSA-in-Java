package BitManipulation;

public class CheckOddOrEven {
    public static void checkOddEven(int num){
        int bitMask = 1;
        if ((num & bitMask) == 0){
            System.out.println("Even number!");
        }
        else{
            System.out.println("Odd number!");
        }
    }
    public static void main(String[] args) {
        checkOddEven(8);
        checkOddEven(5);
        checkOddEven(41);
        checkOddEven(78);
    }
}
