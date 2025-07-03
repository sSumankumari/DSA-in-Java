public class ProductExceptItself {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 2, 9};
        int[] ans = productExceptItself(arr);

        System.out.println("Input Array: ");
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }

        System.out.println("\nProduct Array: ");
        for (int i=0; i<ans.length; i++){
            System.out.print(ans[i]+ " ");
        }
    }

    public static int[] productExceptItself(int[] arr){
        int n = arr.length;
        int left[] = new int[n];
        int right[] = new int[n];
        int ans[] = new int[n];

        // Left Product
        left[0]=1;
        for (int i=1; i<n; i++){
            left[i] = left[i-1]*arr[i-1];
        }
        // Right Product
        right[n-1]=1;
        for (int i=n-2; i>=0; i--){
            right[i] = right[i+1]*arr[i+1];
        }

        // Product Array
        for (int i=0; i<n; i++){
            ans[i] = left[i]*right[i];
        }

        return ans;
    }
}
