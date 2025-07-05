package Strings;

import java.util.Scanner;

public class ArrayBasics {
    public static void main(String[] args) {
        // Array: A container that contains the element of same datatype in a contiguous memory allocation
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int sum=0;
        for (int i=0; i<n; i++){
//            System.out.print(arr[i] +"\t");
            sum = sum + arr[i];
        }
        System.out.println("Sum of elements: "+ sum);
    }
}
