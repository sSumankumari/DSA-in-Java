package Stack;

import java.util.Stack;
class StockSpanner {
    Stack<int []> st; // 0th --> day & 1st --> price

    public StockSpanner() {
        st = new Stack<>();
    }

    public int next(int price) {
        int day = 1;
        while (!st.isEmpty() && st.peek()[1] <= price){
            int[] arr = st.pop();
            day = day + arr[0];
        }

        int[] narr = new int[2];
        narr[0] = day;
        narr[1] = price;

        st.push(narr);

        return day;
    }
}
public class StockSpannerProblem {
    public static void main(String[] args) {
        StockSpanner s = new StockSpanner();

        int[] arr = {100,80,60,70,60,75,85};
//        System.out.print(s.next(100));
//        System.out.print(s.next(80));
//        System.out.print(s.next(60));
//        System.out.print(s.next(70));
//        System.out.print(s.next(60));
//        System.out.print(s.next(75));
//        System.out.print(s.next(85));

        for (int i=0; i<arr.length; i++){
            System.out.print(s.next(arr[i])+" ");
        }
    }
}
