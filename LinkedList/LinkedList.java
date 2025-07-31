package LinkedList;

public class LinkedList {
    public class Node{
        int data;
        Node next;
    }

    private Node head;
    private Node tail;
    private int size = 0;

    public void addFront(int val){
        Node n = new Node();

        n.data = val;
        n.next = head;
        head = n;
        if (size==0) tail = n;

        size++;
    }
    public void addLast(int val){
        if (size==0) {
            // addFront(val);
            Node n = new Node();
            n.data = val;
            head = tail = n;

            size++;
            return;
        }

        Node n = new Node();

        n.data = val;
        tail.next = n;
        tail = n;

        size++;
    }
    public void addAtIndex(int idx, int val) throws Exception{
        if (idx==0){
            addFront(val);
        }
        else if (idx==size){
            addLast(val);
        }
        else {
            Node prev = getNode(idx-1);
            Node n = new Node();

            n.data = val;
            n.next = prev.next;
            prev.next = n;

            size++;
        }
    }

    public Node getNode(int idx) throws Exception {
        if (size < idx) throw new Exception("No node exist!");

        Node curr = head;
        for (int i=0; i<idx; i++){
            curr = curr.next;
        }

        return curr;
    }

    public int removeFirst() throws Exception{
        if (size==0) throw new Exception("LinkedList is empty!");

        Node temp = head;
        head = head.next;
        temp.next = null;

        if (size==1) tail = null;
        size--;

        return temp.data;
    }
    public int removeLast() throws Exception {
        if (size==0) throw new Exception("LinkedList is empty!");
        else if (size==1){
            Node temp = head;
            head = null;
            tail = null;
            size--;

            return temp.data;
        }
        else {
            Node secondLast = getNode(size-2);
            Node temp = tail;
            tail = secondLast;
            tail.next = null;

            return temp.data;
        }
    }
//    public int removeAtIndex(int idx){
//
//    }

    public int size(){
        return size;
    }

    public void display(){
        Node curr = head;
        while (curr != null){
            System.out.print(curr.data+" ->");
            curr = curr.next;
        }
        System.out.println();
    }
}
