package BitManipulation;

public class CountNoOfSetBits {
    public static int countSetBits(int n){
        int count = 0;
        while (n>0){
            if ((n&1) != 0){
                // Check Least Significant Bit (LSB)
                count++;
            }
            n = n>>1;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countSetBits(16));
        System.out.println(countSetBits(7));
        System.out.println(countSetBits(256));
        System.out.println(countSetBits(255));
    }
}
