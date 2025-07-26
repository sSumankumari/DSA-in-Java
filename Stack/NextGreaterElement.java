package Stack;

import java.util.Stack;

public class NextGreaterElement {
    public static int[] find(int[] arr){
        int[] ans = new int[arr.length];

        for (int i=0; i<arr.length; i++){
            ans[i] = -1;
            for (int j=i+1; j<arr.length; j++){
                if (arr[i] < arr[j]){
                    ans[i] = arr[j];
                    break;
                }
            }
        }

        return ans;
    }
    public static int[] findNGE(int[] arr){
        int[] ans = new int[arr.length];
        Stack<Integer> st = new Stack<>();

        for (int i=0; i<arr.length; i++){
            while (!st.isEmpty() && arr[i] > arr[st.peek()]){
                int idx = st.pop();
                ans[idx] = arr[i];
            }
            st.push(i);
        }

        while (!st.isEmpty()){
            int idx = st.pop();
            ans[idx] = -1;
        }

        return ans;
    }
    public static void print(int[] arr){
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {3,1,2,4,6,1,2,1};
        print(arr);

        // Using Bruteforce method -- Time complexity O(n^2)
        System.out.println("Using Bruteforce method: ");
        int[] res = find(arr);
        print(res);

        // Using stack -- Time complexity O(n)
        System.out.println("Using Stack: ");
        int[] ans = findNGE(arr);
        print(ans);
    }
}
