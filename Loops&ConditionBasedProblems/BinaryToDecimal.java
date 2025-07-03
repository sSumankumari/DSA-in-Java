import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your binary number: ");
        int binary = sc.nextInt();
        int temp=binary;

        int i=0;
        int sum=0;
        while (temp>0){
            int digit = temp%10;
            if (digit == 1){
                sum = sum + (int) Math.pow(2, i);
            }
            else {
                sum = sum + 0;
            }
            temp = temp/10;
            i++;
        }

        System.out.println("Your Decimal number: "+ sum);
    }
}
