import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number to check if prime or not: ");
        int num = sc.nextInt();

        int temp=0;
        for (int i=2; i<num-1; i++){
            if (num%i==0){
                System.out.println("Not a prime");
                temp=1;
                break;
            }
        }

        if (temp==0) {
            System.out.println("Prime");
        }
    }
}
