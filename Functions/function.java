public class function {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
//        System.out.println();
//        swap(arr);
//        for (int i=0; i<arr.length; i++){
//            System.out.print(arr[i]+ " ");
//        }
        System.out.println();
        reverse(arr);
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
    }

    public static void swap(int arr[]) {
        int n = arr.length;
        int temp = arr[1];
        arr[1] = arr[n-2];
        arr[n-2] = temp;
        System.out.println("Swap function executed!");
    }

    public static void reverse(int arr[]) {
        int start=0;
        int end = arr.length-1;
        while (start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
        System.out.println("Reverse function executed!");
    }
}
