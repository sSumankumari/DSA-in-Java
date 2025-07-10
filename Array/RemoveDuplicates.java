import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);

        int idx = 1;
        for (int i = 1; i < n; i++) {
            if (arr[i] != arr[idx - 1]){
                arr[idx++] = arr[i];
            }
        }

        System.out.println(idx);
        for (int i = 0; i < idx; i++) System.out.print(arr[i] + " ");
    }
}
