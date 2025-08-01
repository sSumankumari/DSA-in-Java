package Stack;

import java.util.Stack;

public class DynamicStack extends StackUsingArray {
    @Override
    public void push(int val) throws Exception {
        if (!isFull()){
            super.push(val);
        }
        else {
            int[] narr = new int[2 * super.arr.length];

            for (int i=0; i<arr.length; i++){
                narr[i] = arr[i];
            }

            arr = narr;
            super.push(val);
        }
    }
}
