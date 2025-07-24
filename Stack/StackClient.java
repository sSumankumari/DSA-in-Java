package Stack;

public class StackClient {
    public static void main(String[] args) throws Exception{
        StackUsingArray s = new StackUsingArray(5);

        s.push(12);
        s.push(4);
        s.push(9);
//        s.push(7);

        System.out.println(s.isEmpty());
        System.out.println(s.isFull());

        System.out.println(s.pop());
        System.out.println(s.peek());
        System.out.println(s.size());

        s.display();
    }
}
