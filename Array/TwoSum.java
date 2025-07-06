import java.lang.annotation.Target;

public class TwoSum {
    public static void main(String[] args) {
        int arr[] = {3, 5, 1, 7, 8, 9};
        int target = 8;
        int found=0;

        for (int i=0; i<arr.length; i++){
            for (int j=i+1; j<arr.length; j++){
                if (arr[i]+arr[j] == target){
                    System.out.println(arr[i] +", "+ arr[j]);
                    found=1;
                    break;
                }
            }
            if (found==1) break;
        }

        if (found==0) System.out.println("Target not found!");
    }
}
