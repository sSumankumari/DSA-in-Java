package LinkedList;

public class LinkedListCycle2 {
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }
    public static ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        ListNode n = head;
        while (fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;

            // Cycle
            if (slow == fast) {
                ListNode slow2 = head;

                while (slow2 != slow){
                    slow = slow.next;
                    slow2 = slow2.next;
                }

                return slow;
            }
        }

        return null;
    }
    public static void main(String[] args) {

    }
}
