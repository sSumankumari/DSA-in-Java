import java.lang.annotation.Target;

public class TwoSum {
    public static void main(String[] args) {
        int arr[] = {3, 5, 1, 7, 8, 9};
        int target = 8;
        int found=0;
//        int sum=0;
//        int[] arrSum = new int[2];
//        for (int i=0; i<arr.length; i++){
//            for (int j=i+1; i<arr.length; i++){
//                sum = arr[i] + arr[j];
//                System.out.println(sum);
//                if (sum == target){
//                    arrSum[0] = arr[i];
//                    arrSum[1] = arr[j];
//                    found = 1;
//                }
//            }
//        }
//        if (found==1){
//            System.out.println(arrSum[0] + ", "+ arrSum[1]);
//        }
//        else {
//            System.out.println("Target not found");
//        }


        for (int i=0; i<arr.length; i++){
            for (int j=i+1; i<arr.length; i++){
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
