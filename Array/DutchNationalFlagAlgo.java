public class DutchNationalFlagAlgo {
    public static void main(String[] args) {
//        int[] arr = {1, 1, 0, 2, 1, 0, 2, 1};
        int[] arr = {2,1,0,1,2,0,2};

        for (int i=0; i< arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
        sort(arr);
        for (int i=0; i< arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
    }
    public static void sort(int[] arr){
        int start=0;
        int end=arr.length-1;

        int i=0;
        while (i<=end){
            if (arr[i]==0){
                int temp = arr[start];
                arr[start] = arr[i];
                arr[i] = temp;
                start++;
                i++;
            } else if (arr[i]==2){
                int temp = arr[end];
                arr[end] = arr[i];
                arr[i] = temp;
                end--;
            } else i++;
        }
    }
}