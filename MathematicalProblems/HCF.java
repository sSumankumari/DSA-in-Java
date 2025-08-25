import java.util.Scanner;

public class HCF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        System.out.print("Enter your number of inputs: ");
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//        for (int i=0; i<n; i++) {
//            arr[i] = sc.nextInt();
//        }

        int n1=60;
        int n2=30;

        int hcf = 1;
        for (int i=2; i<=Math.min(n1, n2); i++){
            if (n1%i==0 && n2%i==0){
                hcf = i;
            }
        }

        System.out.println("HCF of numbers are: "+ hcf);
    }
}
