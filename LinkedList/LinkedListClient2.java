package LinkedList;

public class LinkedListClient2 {
    public static void main(String[] args) throws Exception {
        LinkedList ll = new LinkedList();

        ll.addFront(5);
        ll.addLast(9);
        ll.display();

        ll.addLast(10);
        ll.addFront(4);
        ll.addAtIndex(2, 20);

        ll.display();
        System.out.println(ll.size());
//        System.out.println(ll.getNode(4));

        ll.addFront(22);
        ll.addLast(40);
        ll.addAtIndex(4,37);
        ll.addLast(72);
        ll.addAtIndex(6, 51);

        System.out.println(ll.size());
        ll.display();

        ll.removeFirst();
        ll.removeLast();
        ll.display();
    }
}
