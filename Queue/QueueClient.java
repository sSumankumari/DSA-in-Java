package Queue;

public class QueueClient {
    public static void main(String[] args) throws Exception {
        QueueUsingArray q = new QueueUsingArray(5);

//        System.out.println(q.isEmpty());
//        System.out.println(q.isFull());

        q.enqueue(6);
        q.enqueue(4);
        q.enqueue(12);
        q.enqueue(8);
        q.enqueue(20);
//        q.enqueue(1);

        q.display();

        System.out.println(q.dequeue());
        System.out.println(q.dequeue());

        q.enqueue(-2);

        q.display();

        System.out.println(q.peek());
    }
}
