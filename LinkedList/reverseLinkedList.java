package LinkedList;

import java.util.List;

public class reverseLinkedList {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public static ListNode reverseList(ListNode head){
        if(head == null) return null;
        ListNode prev = null;
        ListNode curr = head;

        while (curr != null){
            ListNode ahead = curr.next;
            curr.next = prev;

            prev = curr;
            curr = ahead;
        }

        return prev;
    }
    public static void main(String[] args) {

    }
}
