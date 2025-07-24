package Stack;

public class StackUsingArray {
    private int arr[];
    private int top;

    public StackUsingArray(){
        arr = new int[5];
        top = 0;
    }

    public StackUsingArray(int n){
        arr = new int[n];
        top = 0;
    }

    public boolean isEmpty(){
        return top==0;
    }
    public boolean isFull(){
        return top==arr.length;
    }

    public void push(int val) throws Exception {
        if(isFull()) throw new Exception("Stack is full!");

        arr[top] = val;
        top++;
    }

    public int pop() throws Exception {
        if(isEmpty()) throw new Exception("Stack is empty!");

        int temp = arr[top-1];
        top--;
        return temp;
    }

    public int peek() throws Exception {
        if(isEmpty()) throw new Exception("Your Stack is empty!");

        return arr[top-1];
    }

    public int size(){
        return top;
    }

    public void display(){
        for (int i=0; i<top; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
