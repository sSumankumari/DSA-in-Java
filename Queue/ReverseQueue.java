package Queue;

public class ReverseQueue {
    public static void reverse(QueueUsingArray queue) throws Exception{
        if (queue.isEmpty()){
            return;
        }

        int rev = queue.dequeue();
        reverse(queue);
        queue.enqueue(rev);
    }
    public static void main(String[] args) throws Exception {
        QueueUsingArray q = new QueueUsingArray(5);

        q.enqueue(1);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(8);

        q.display();

        reverse(q);

        q.display();
    }
}
