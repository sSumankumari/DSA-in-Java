package Recursion;

public class BinaryStringsProblem {
    public static void printBinWithoutConsecutiveOnes(int n, boolean lastPlace, String str){
        if (n == 0){
            System.out.print(str + " ");
            return;
        }
        printBinWithoutConsecutiveOnes(n-1, true, str+"0");
        if (lastPlace == true){
            printBinWithoutConsecutiveOnes(n-1, false, str+"1");
        }
    }
    public static void printBinWithoutConsecutiveZeroes(int n, boolean lastPlace, String str){
        if (n == 0){
            System.out.print(str + " ");
            return;
        }

        printBinWithoutConsecutiveZeroes(n-1, false, str+"1");
        if (lastPlace != true){
            printBinWithoutConsecutiveZeroes(n-1, true, str+"0");
        }
    }
    public static void printAllBinary(int n, String str){
        if (n == 0){
            System.out.print(str + " ");
            return;
        }
        printAllBinary(n-1, str+"0");
        printAllBinary(n-1, str+"1");
    }
    public static void main(String[] args) {
        System.out.println("All binary strings of length 3:");
        printAllBinary(3, "");
        System.out.println("\nBinary strings of length 3 without consecutive 1s:");
        printBinWithoutConsecutiveOnes(3, true, "");
        System.out.println("\nBinary strings of length 3 without consecutive 0s:");
        printBinWithoutConsecutiveZeroes(3, false, "");

        System.out.println("\n\nAll binary strings of length 4:");
        printAllBinary(4, "");
        System.out.println("\nBinary strings of length 4 without consecutive 1s:");
        printBinWithoutConsecutiveOnes(4, true, "");
        System.out.println("\nBinary strings of length 4 without consecutive 0s:");
        printBinWithoutConsecutiveZeroes(4, false, "");
    }
}
