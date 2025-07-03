import java.util.Scanner;

public class CelciusToFahrenheit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter temperature in Celcius: ");
//        int cel = sc.nextInt();

        for (int i=20; i<=100; i+=2){
            int fah = (int) (i*1.8) + 32;
            System.out.println(i + "°C = "+ fah + "°F");
        }
//        int fah = (int) (cel * 1.8) + 32;
//        System.out.println("Temperature converted into Fahrenheit is: "+ fah);
    }
}
