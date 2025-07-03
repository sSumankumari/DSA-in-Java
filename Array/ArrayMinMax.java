public class ArrayMinMax {
    public static void main(String[] args) {
        int arr[] = {23, 12, 32, 22, 65, 11};
        int n=6;

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

//        for (int i=0; i<arr.length; i++){
//            max = Math.max(max, arr[i]);
//            min = Math.min(min, arr[i]);
//        }

        for (int i=0; i<arr.length; i++){
            if (max<arr[i]){
                max = arr[i];
            }
            if (min>arr[i]){
                min = arr[i];
            }
        }

        System.out.println(max);
        System.out.println(min);
    }
}
