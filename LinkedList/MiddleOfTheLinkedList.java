package LinkedList;

public class MiddleOfTheLinkedList {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public static ListNode middleNode(ListNode head) {
        ListNode curr = head;
        int size = 0;
        while (curr != null){
            curr = curr.next;
            size++;
        }

        ListNode mid = getNode(size/2, head);

        return mid;
    }
    public static ListNode getNode(int idx, ListNode head){
        ListNode curr = head;
        for (int i=0; i<idx; i++){
            curr = curr.next;
        }

        return curr;
    }

    // Using Slow fast pointers --> fast has speed double of slow i.e, slow = 1 m/sec & fast = 2 m/sec
    public static ListNode findMiddleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }
    public static void main(String[] args) {

    }
}
