package Stack;

import java.util.Arrays;
import java.util.Stack;

public class DailyTemperatures {
    public static int[] find(int[] temperatures) {
        int n = temperatures.length;
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();

//        Arrays.fill(ans, 0);

        for (int i=0; i<n; i++){
            while(!st.isEmpty() && temperatures[i]>temperatures[st.peek()]){
                int idx = st.pop();
                ans[idx] = i-idx;
            }
            st.push(i);
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
        int[] arr = {73,74,75,71,69,72,76,73};
        print(arr);

        int[] ans = find(arr);
        print(ans);
    }
}
